package patterns.own.abstract_factory.menus;

import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_RESET;
import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_YELLOW;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class LightMenuBar extends MenuBar {

    public void showMenu() {
        System.out.print(ANSI_YELLOW.getColor() + "menu bar" + ANSI_RESET.getColor());
    }
}
