package patterns.abstract_factory;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public abstract class AbstractStyleFactory {

    protected abstract Window createWindow();
    protected abstract MenuBar createMenuBar();
    protected abstract Button createButton();

}
