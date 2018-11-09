package patterns.abstract_factory;

import patterns.abstract_factory.factories.AbstractStyleFactory;
import patterns.abstract_factory.windows.Window;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class StyleManager {
    private Window window;

    StyleManager(AbstractStyleFactory factory){
        window = factory.createWindow();
    }

    void applyStyle(){
        window.showWindow();
    }
}
