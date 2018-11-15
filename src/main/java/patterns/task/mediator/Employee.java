package patterns.task.mediator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Employee implements Requester {
    private String name;
    private Mediator mediator;

    public Employee(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendRequest(RequestType requestType, String description) {
        mediator.processRequest(this, requestType, description);
    }

    public void setMediator(Mediator mediator){
            this.mediator = mediator;
    }

    public String getName() {
        return  name;
    }
}
