package Decorator.AbstractClasses;

import Decorator.Interfaces.Pizza;

public class PizzaDecorator implements Pizza {
    protected Pizza customPizza;

    public PizzaDecorator(Pizza customPizza) {
        this.customPizza = customPizza;
    }
    @Override
    public String make() {
        return customPizza.make();
    }
}
