package patterns.task.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class Library implements Subscriber {
    String name;
    private List<NewsPaper> editionCollection;


    public Library(String name) {
        this.name = name;
        editionCollection = new ArrayList<>();
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.addSubscriber(this);
    }

    @Override
    public void getUpdate(NewsPaper newAddition) {
        editionCollection.add(newAddition);
        System.out.println(name + " received a new edition #" + newAddition.getIssueNumber() + " dated " + newAddition.getReleaseDate());
    }
}
