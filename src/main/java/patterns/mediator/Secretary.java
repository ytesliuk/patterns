package patterns.mediator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Secretary implements Mediator {
    private static int requestNumber;
    private AccountingDep acc = new AccountingDep(this);
    private Director director = new Director(this);

    @Override
    public void processRequest(Requester requester, RequestType requestType, String description) {
        System.out.println("Request #" + (++requestNumber) + " from " + requester.getName() + ": " + description);
        switch (requestType){
            case SALARY_PAYMENT:
                System.out.println("Request has been sent to accounting department");
                acc.salaryQuestions(description);
                break;
            case SALARY_CHANGE:
                System.out.println("Request has been sent to director");
                director.salaryChangeRequest(requester.getName(),description);
                break;
            case REPORTING:
                System.out.println("Request has been sent to accounting department");
                acc.personalReporting(requester.getName(),description);
                break;
            case REPORT:
                System.out.println("Request has been sent to director");
                break;
        }
    }
}
