package patterns.task.state2;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class InTheAirState extends State {

    public InTheAirState(Plane plane) {
        super(plane);
        System.out.println("tacking off....flying");
    }

    @Override
    void fly() {
        System.out.println("flying");
    }

    @Override
    void fire(Armament armament) {
        if(!getPlane().contain(armament)){
            if(question("there is no such armament on board. \ndo you want to ground and fix it?")){
                setTheWeapon(armament);
            }
        } else if (!getPlane().isEnoughAmmunition(armament,1)){
            if(question("there is not enough ammunition. \ndo you want to ground and fix it?")){
                replenish(armament,5);
            }
        } else {
            planeArmament.put(armament,planeArmament.get(armament) - 1);
            System.out.println("fired");
        }
    }

    @Override
    void ground() {
        getPlane().changeState(new OnTheGroundState(getPlane()));
    }

    @Override
    void setTheWeapon(Armament armament) {
        if(planeArmament.containsKey(armament)){
            System.out.println(armament.name() + " is already installed");
        } else {
            if(question("can't install armament on the fly.\ndo you want to ground and fix this")) {
                set(armament);
            }
        }
    }

    @Override
    void replenishAmmunition(Armament armament, int amount) {
        if(question("can't replenish ammunition on the fly.\ndo you want to ground fix this?")) {
            replenish(armament, amount);
        }
    }

    private void replenish(Armament armament, int amount){
        ground();
        getPlane().replenishAmmunition(armament,5);
        getPlane().fly();
    }
    private void set(Armament armament){
        ground();
        getPlane().setTheWeapon(armament);
        getPlane().fly();
    }
}
