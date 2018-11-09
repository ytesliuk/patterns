package patterns.abstract_factory.factories;

import patterns.abstract_factory.buttons.Button;
import patterns.abstract_factory.buttons.LightButton;
import patterns.abstract_factory.menus.LightMenuBar;
import patterns.abstract_factory.menus.MenuBar;
import patterns.abstract_factory.windows.LightWindow;
import patterns.abstract_factory.windows.Window;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class LightStyleFactory  extends AbstractStyleFactory{

    public Window createWindow() {
        return new LightWindow();
    }

    public MenuBar createMenuBar() {
        return new LightMenuBar();
    }

    public Button createButton() {
        return new LightButton();
    }
}
