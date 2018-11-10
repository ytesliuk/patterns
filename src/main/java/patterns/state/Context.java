package patterns.state;

/**
 * Created by Yuliia Tesliuk on 11/10/2018
 */
public enum Context {
    ON_THE_VALLEY (new MushroomerState()),
    NEAR_THE_RIVER (new FisherState()),
    SEE_ANIMAL (new HunterState());

    private State state;

    Context(State state) {
        this.state = state;
    }

    public static State getState(Context context){
        return context.state;
    }
}
