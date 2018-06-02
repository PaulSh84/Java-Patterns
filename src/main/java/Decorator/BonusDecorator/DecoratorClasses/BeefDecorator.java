package Decorator.BonusDecorator.DecoratorClasses;

import Decorator.BonusDecorator.AbstractClass.SandwichDecorator;
import Decorator.BonusDecorator.Interface.Sandwich;

public class BeefDecorator extends SandwichDecorator {
    public BeefDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }
    @Override
    public String make() {
        return customSandwich.make() + addBeef();
    }

    private String addBeef() {
        return " + Beef";
    }
}
