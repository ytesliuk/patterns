package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class NewsPaperPublisher implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void sendUpdate(final NewsPaper newEdition) {
        subscribers.forEach(x -> x.getUpdate(newEdition));
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

}
