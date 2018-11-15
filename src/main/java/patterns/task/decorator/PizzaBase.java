package patterns.task.decorator;

/**
 * Created by Yuliia Tesliuk on 11/12/2018
 */
public class PizzaBase implements Pizza {



    public String getDescription() {
        return "pizza Base";
    }

    @Override
    public double getPizzaPrice() throws IllegalArgumentException{
        return getIngredientPrice("PizzaBase") * (1 + PROFIT);
    }
}
