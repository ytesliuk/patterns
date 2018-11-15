package patterns.own.abstract_factory.menus;

import static patterns.own.abstract_factory.ConsoleTextColor.*;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class DarkMenuBar extends MenuBar {

    public void showMenu() {
        System.out.print(ANSI_CYAN.getColor() + "menu bar" + ANSI_RESET.getColor());
    }
}
