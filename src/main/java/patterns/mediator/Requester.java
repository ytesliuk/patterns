package patterns.mediator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public interface Requester {

    String getName();

    void sendRequest(RequestType requestType, String description);
}
