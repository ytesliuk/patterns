package patterns.task.adapter;

/**
 * Created by Yuliia Tesliuk on 11/15/2018
 */
public class VdiConnector {
    private String name = "VDI connector";

    public void connectTo(VDIPort port){
        System.out.println(name + " is connected to " + port.getName());
    }


}
