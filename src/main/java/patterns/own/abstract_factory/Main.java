package patterns.own.abstract_factory;

import patterns.own.abstract_factory.factories.DarkStyleFactory;
import patterns.own.abstract_factory.factories.LightStyleFactory;

/**
 * Created by Yuliia Tesliuk on 11/09/2018
 */
public class Main {

    public static void main(String[] args){
        new StyleManager (new LightStyleFactory()).applyStyle();
        new StyleManager (new DarkStyleFactory()).applyStyle();
    }
}
