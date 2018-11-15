package patterns.task.abstract_facroty;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class MechanicalWatchFactory extends WatchFactory {

    private Dial createDial() {
        return new MechanicalDial();
    }

    private Band createBand() {
        return new LeatherBand();
    }

    @Override
    public Watch constructWatch() {
        return new Watch(createDial(),createBand());
    }
}
