package Decorator;

import Decorator.Interfaces.Pizza;

public class SimplePizza implements Pizza {

    @Override
    public String make() {
        return "Base";
    }
}
