package patterns.task.observer;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public interface Publisher {

    void sendUpdate(NewsPaper newEdition);

    void addSubscriber(Subscriber subscriber);
}
