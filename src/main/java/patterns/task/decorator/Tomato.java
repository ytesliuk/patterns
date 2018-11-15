package patterns.task.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Tomato extends IngredientDecorator {

    Tomato(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", tomatoes";
    }

    @Override
    public double getPizzaPrice() throws IllegalArgumentException{
        return pizza.getPizzaPrice() + getIngredientPrice("Tomatoes") * (1 + PROFIT);
    }
}
