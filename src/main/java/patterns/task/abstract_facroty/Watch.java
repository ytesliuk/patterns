package patterns.task.abstract_facroty;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class Watch {
    private Dial dial;
    private Band band;

    public Watch(Dial dial, Band band) {
        this.dial = dial;
        this.band = band;
    }

    @Override
    public String toString() {
        return "A watch with " + dial.toString() + " and " + band.toString();
    }
}
