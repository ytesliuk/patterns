package patterns.observer;

import java.time.LocalDate;
import java.util.Random;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class Main {
    public static void main(String[] args){
        Publisher publisher = new NewsPaperPublisher();
        Random random = new Random();
        for (int i = 1; i <= 10; i++){
            Resident resident = new Resident("Resident #" + i);
            if(random.nextBoolean()){
                resident.subscribe(publisher);
            }
        }
        Library library = new Library("Library");
        library.subscribe(publisher);

        NewsPaper newEdition = new NewsPaper(5, LocalDate.of(2018,11,13), "HOT NEWS", "content");

        publisher.sendUpdate(newEdition);

    }
}
