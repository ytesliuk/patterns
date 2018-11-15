package patterns.task.state2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Plane {
    private State state;
    private Map<Armament,Integer> armament = new HashMap<>();

    public Plane() {
        this.state = new OnTheGroundState(this);
    }
    public void changeState(State state){
        this.state = state;
    }
    public Map<Armament,Integer> getArmament(){
        return armament;
    }

    public State getState() {
        return state;
    }

    void fly() {
        state.fly();
    }
    void fire(Armament armament) {
        state.fire(armament);
    }
    void ground() {
        state.ground();
    }
    void setTheWeapon(Armament armament) {
        state.setTheWeapon(armament);
    }
    void replenishAmmunition(Armament armament, int amount) {
        state.replenishAmmunition(armament,amount);
    }

    boolean isEnoughAmmunition(Armament armament, int number){
        return this.armament.containsKey(armament) && this.armament.get(armament) >= number;
    }
    boolean contain(Armament armament){
        return this.armament.containsKey(armament);
    }
}
