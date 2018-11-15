package patterns.task.state2;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Main {
    public static void main(String[] args){
        Plane plane = new Plane();
        plane.fly();
        plane.setTheWeapon(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.fire(Armament.Rocket);
        plane.ground();
    }

}
