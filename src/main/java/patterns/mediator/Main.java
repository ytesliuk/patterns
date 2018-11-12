package patterns.mediator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Main {
    public static void main(String[] args){
        Mediator mediator = new Secretary();
        Employee employee = new Employee("Petrov Petr", mediator);

        System.out.println("1)");
        employee.sendRequest(RequestType.SALARY_PAYMENT,"there was no salary payment for previous month");

        System.out.println("\n2)");
        employee.sendRequest(RequestType.SALARY_CHANGE,"request for salary change");

    }
}
