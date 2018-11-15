package patterns.abstract_facroty2;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class DigitalWatchFactory extends WatchFactory{

    private Dial createDial() {
        return new ElectronicDial();
    }

    private Band createBand() {
        return new MetalBand();
    }

    @Override
    public Watch constructWatch() {
        return new Watch(createDial(),createBand());
    }
}
