package Decorator.DecoratorClasses;

import Decorator.AbstractClasses.PizzaDecorator;
import Decorator.Interfaces.Pizza;

public class MozzarellaDecorator extends PizzaDecorator {

    public MozzarellaDecorator(Pizza customPizza) {
        super(customPizza);
    }

    public String make() {
        return customPizza.make() + addMozzarella();
    }

    private String addMozzarella() {
        return " + Mozzarella";
    }
}
