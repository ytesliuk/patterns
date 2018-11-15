package patterns.own.abstract_factory.factories;

import patterns.own.abstract_factory.buttons.Button;
import patterns.own.abstract_factory.menus.MenuBar;
import patterns.own.abstract_factory.windows.Window;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public abstract class AbstractStyleFactory {

    public abstract Window createWindow();
    public abstract MenuBar createMenuBar();
    public abstract Button createButton();

}
