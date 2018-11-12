package patterns.state;

import static patterns.state.Context.NEAR_THE_RIVER;
import static patterns.state.Context.ON_THE_VALLEY;
import static patterns.state.Context.SEE_ANIMAL;

/**
 * Created by Yuliia Tesliuk on 11/10/2018
 */
public class Main {

    public static void main(String[] args){
        Human human = new Human("Mike");

        human.action();

        human.setState(Context.getState(NEAR_THE_RIVER));
        human.action();

        human.setState(Context.getState(ON_THE_VALLEY));
        human.action();

        human.setState(Context.getState(SEE_ANIMAL));
        human.action();
    }
}
