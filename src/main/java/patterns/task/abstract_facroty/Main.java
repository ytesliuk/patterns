package patterns.task.abstract_facroty;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class Main {
    public static void main(String[] args){

        WatchFactory factory = new DigitalWatchFactory();
        Watch watch = factory.constructWatch();
        System.out.println(watch);

        WatchFactory factory2 = new MechanicalWatchFactory();
        Watch watch2 = factory2.constructWatch();
        System.out.println(watch2);

    }
}
