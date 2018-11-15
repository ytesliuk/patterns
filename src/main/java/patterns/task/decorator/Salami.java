package patterns.task.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Salami extends IngredientDecorator {

    Salami(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", salami";
    }

    @Override
    public double getPizzaPrice() throws IllegalArgumentException{
        return pizza.getPizzaPrice() + getIngredientPrice("Salami") * (1 + PROFIT);
    }
}
