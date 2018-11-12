package patterns.state;

/**
 * Created by Yuliia Tesliuk on 11/10/2018
 */
public class Human {
    private static State defaultState;
    String name;
    State state;

    Human(String name){
        this.name = name;
    }

    public void setState(State state){
        this.state = state;
    }

    public void action(){
        System.out.println(name + " is " + ((state == null) ? "doing nothing." : state.action()));
    }
}
