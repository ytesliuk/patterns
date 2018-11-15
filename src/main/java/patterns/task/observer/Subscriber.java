package patterns.task.observer;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public interface Subscriber {

    void getUpdate(NewsPaper newAddition);

    void subscribe(Publisher publisher);
}
