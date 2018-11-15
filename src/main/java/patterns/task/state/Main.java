package patterns.task.state;

/**
 * Created by Yuliia Tesliuk on 11/10/2018
 */
public class Main {

    public static void main(String[] args){
        Human human = new Human("Mike");

        human.action();

        human.setState(Context.getState(Context.NEAR_THE_RIVER));
        human.action();

        human.setState(Context.getState(Context.ON_THE_VALLEY));
        human.action();

        human.setState(Context.getState(Context.SEE_ANIMAL));
        human.action();
    }
}
