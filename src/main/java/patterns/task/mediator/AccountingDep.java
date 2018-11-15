package patterns.task.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class AccountingDep implements Requester {
    Mediator mediator;
    private static int caseNumber;
    private Map<Integer,String> cases = new HashMap<>();

    AccountingDep(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "accounting department";
    }

    public void salaryQuestions(String description){
        cases.put(++caseNumber,description);
        System.out.println("Request has been added to the queue");
    }

    public void personalReporting(String name, String description) {
        cases.put(++caseNumber,description);
        System.out.println("processing...");
        sendRequest(RequestType.REPORT,"no salary changes during employment");
    }

    @Override
    public void sendRequest(RequestType requestType, String description) {
        mediator.processRequest(this, requestType,description);
    }
}
