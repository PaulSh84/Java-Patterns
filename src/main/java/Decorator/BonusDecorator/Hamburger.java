package Decorator.BonusDecorator;

import Decorator.BonusDecorator.Interface.Sandwich;

public class Hamburger implements Sandwich {
    @Override
    public String make() {
        return "Hamburger";
    }
}
