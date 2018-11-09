package patterns.abstract_factory.windows;

import patterns.abstract_factory.buttons.LightButton;
import patterns.abstract_factory.menus.LightMenuBar;

import static patterns.abstract_factory.ConsoleTextColor.ANSI_RESET;
import static patterns.abstract_factory.ConsoleTextColor.ANSI_YELLOW;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class LightWindow extends Window {

    public void showWindow() {
        System.out.print(ANSI_YELLOW.getColor() + "Window with " + ANSI_RESET.getColor());
        new LightMenuBar().showMenu();
        System.out.print(ANSI_YELLOW.getColor() + " and " + ANSI_RESET.getColor());
        new LightButton().showButton();
        System.out.println();
    }
}
