package patterns.abstract_factory.buttons;

import static patterns.abstract_factory.ConsoleTextColor.ANSI_RESET;
import static patterns.abstract_factory.ConsoleTextColor.ANSI_YELLOW;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class LightButton extends Button {

    public void showButton() {
        System.out.print(ANSI_YELLOW.getColor() + "button" + ANSI_RESET.getColor());
    }
}
