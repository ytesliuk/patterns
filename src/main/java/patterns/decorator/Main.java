package patterns.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Main {
    public static void main(String[] args){
        Pizza pizza = new Mushrooms(new Salami(new Cheese(new Tomato(new PizzaBase()))));

        System.out.print("Pizza Classic: ");
        System.out.println(pizza.getDescription());
        System.out.format("Price: %.2f%n", pizza.getPizzaPrice());


    }
}
