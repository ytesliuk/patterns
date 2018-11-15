package patterns.own.abstract_factory.buttons;

import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_CYAN;
import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_RESET;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class DarkButton extends Button {

    public void showButton() {
        System.out.print(ANSI_CYAN.getColor() + "button" + ANSI_RESET.getColor());
    }
}
