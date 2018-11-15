package patterns.task.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Mushrooms extends IngredientDecorator{

    Mushrooms(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", mushrooms";
    }

    @Override
    public double getPizzaPrice() throws IllegalArgumentException{
        return pizza.getPizzaPrice() + getIngredientPrice("Mushrooms") * (1 + PROFIT);
    }
}
