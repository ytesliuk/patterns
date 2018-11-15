package patterns.task.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public interface Pizza {

    double PROFIT = 0.2;

    String getDescription();
    default double getIngredientPrice(String name){
        Properties property = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/PizzaIngredientPrice.properties");
            property.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  Double.parseDouble(property.getProperty(name));
    }

    double getPizzaPrice();

}
