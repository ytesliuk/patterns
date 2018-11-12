package patterns.mediator;


/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Director implements Requester {
    String name;
    Mediator mediator;

    public Director(Mediator mediator) {
        this.name = "Director";
        this.mediator = mediator;
    }

    public void salaryChangeRequest(String name, String description) {
        sendRequest(RequestType.REPORTING, "Salary change history for employee " + name);
        sendRequest(RequestType.FEEDBACK, "A feedback from direct manager for " + name);
        System.out.println("making decision...");
    }

    @Override
    public void sendRequest(RequestType requestType, String description) {
        mediator.processRequest(this, requestType, description);
    }

    public String getName(){
        return name;
    }
}
