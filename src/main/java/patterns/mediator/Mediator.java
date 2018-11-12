package patterns.mediator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public interface Mediator {

    void processRequest(Requester requester, RequestType requestType, String description);
}
