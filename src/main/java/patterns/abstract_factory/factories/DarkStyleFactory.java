package patterns.abstract_factory.factories;

import patterns.abstract_factory.buttons.Button;
import patterns.abstract_factory.buttons.DarkButton;
import patterns.abstract_factory.menus.DarkMenuBar;
import patterns.abstract_factory.menus.MenuBar;
import patterns.abstract_factory.windows.DarkWindow;
import patterns.abstract_factory.windows.Window;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class DarkStyleFactory extends AbstractStyleFactory {

    public Window createWindow() {
        return new DarkWindow();
    }

    public MenuBar createMenuBar() {
        return new DarkMenuBar();
    }

    public Button createButton() {
        return new DarkButton();
    }
}
