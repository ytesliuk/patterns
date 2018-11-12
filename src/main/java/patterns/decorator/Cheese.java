package patterns.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class Cheese extends IngredientDecorator{
    Cheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double getPizzaPrice() throws IllegalArgumentException{
        return pizza.getPizzaPrice() + getIngredientPrice("Cheese") * (1 + PROFIT);
    }
}
