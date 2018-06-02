package Decorator.BonusDecorator.DecoratorClasses;

import Decorator.BonusDecorator.AbstractClass.SandwichDecorator;
import Decorator.BonusDecorator.Interface.Sandwich;

public class OnionsDecorator extends SandwichDecorator {
    public OnionsDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }
    @Override
    public String make() {
        return customSandwich.make() + addOnions();
    }

    private String addOnions() {
        return " + Onions";
    }
}
