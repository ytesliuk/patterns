package patterns.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public abstract class IngredientDecorator implements Pizza {

    protected Pizza pizza;

    public IngredientDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getPizzaPrice();

}
