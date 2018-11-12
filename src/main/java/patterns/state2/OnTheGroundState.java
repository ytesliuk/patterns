package patterns.state2;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class OnTheGroundState extends State{


    public OnTheGroundState(Plane plane) {
        super(plane);
        System.out.println("grounded");
    }

    @Override
    public void fly() {
        getPlane().changeState(new InTheAirState(getPlane()));
    }

    @Override
    public void fire(Armament armament) {
        System.out.println("can't fire on the ground");
    }

    @Override
    public void ground() {
        System.out.println("already on the ground");
    }

    @Override
    public void setTheWeapon(Armament armament) {
        if(planeArmament.containsKey(armament)){
            System.out.println(armament.name() + " is already installed");
        } else {
            this.planeArmament.put(armament,5);
            System.out.println("installing " + armament.name() + ".... installed");
        }
    }

    @Override
    public void replenishAmmunition(Armament armament, int amount) {
        if(!planeArmament.containsKey(armament)){
            System.out.println("there is no such armament on the board");
        } else {
            planeArmament.put(armament,amount);
            System.out.println("ammunition stock replenished");
        }
    }
}
