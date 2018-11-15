package patterns.task.state2;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public abstract class State {
    private Plane plane;
    private Scanner reader = new Scanner (System.in);
    protected Map<Armament,Integer> planeArmament;


    protected State(Plane plane) {
        this.plane = plane;
        planeArmament = getPlane().getArmament();
    }


    abstract void fly();
    abstract void fire(Armament armament);
    abstract void ground();
    abstract void setTheWeapon(Armament armament);
    abstract void replenishAmmunition(Armament armament, int amount);

    protected Plane getPlane() {
        return plane;
    }

    protected Scanner getReader() {
        return reader;
    }

    protected boolean question(String string){
        while(true){
            System.out.println(string + "(Y/N)");
            String answer = getReader().nextLine();
            if(answer.equals("Y")){
                return true;
            } else if (answer.equals("N")) {
                return false;
            }
        }
    }
}
