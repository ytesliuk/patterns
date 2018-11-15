package patterns.own.abstract_factory.windows;

import patterns.own.abstract_factory.buttons.DarkButton;
import patterns.own.abstract_factory.menus.DarkMenuBar;

import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_CYAN;
import static patterns.own.abstract_factory.ConsoleTextColor.ANSI_RESET;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class DarkWindow extends Window {

    public void showWindow() {
        System.out.print(ANSI_CYAN.getColor() + "Window with " + ANSI_RESET.getColor());
        new DarkMenuBar().showMenu();
        System.out.print(ANSI_CYAN.getColor() + " and " + ANSI_RESET.getColor());
        new DarkButton().showButton();
        System.out.println();
    }
}
