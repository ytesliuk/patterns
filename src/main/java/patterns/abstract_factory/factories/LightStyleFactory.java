package patterns.abstract_factory;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class LightStyleFactory  extends AbstractStyleFactory{

    protected Window createWindow() {
        return new LightWindow();
    }

    protected MenuBar createMenuBar() {
        return new LightMenuBar();
    }

    protected Button createButton() {
        return new LightButton();
    }
}
