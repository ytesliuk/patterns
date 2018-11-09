package patterns.abstract_factory;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class DarkStyleFactory extends AbstractStyleFactory {

    protected Window createWindow() {
        return new DarkWindow();
    }

    protected MenuBar createMenuBar() {
        return new DarkMenuBar();
    }

    protected Button createButton() {
        return new DarkButton();
    }
}
