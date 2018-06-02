package Decorator.BonusDecorator.DecoratorClasses;

import Decorator.BonusDecorator.AbstractClass.SandwichDecorator;
import Decorator.BonusDecorator.Interface.Sandwich;

public class TomatoDecorator extends SandwichDecorator {
    public TomatoDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addTomato();
    }

    private String addTomato() {
        return " + Tomato";
    }
}
