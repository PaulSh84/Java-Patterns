import Decorator.BonusDecorator.DecoratorClasses.BeefDecorator;
import Decorator.BonusDecorator.DecoratorClasses.OnionsDecorator;
import Decorator.BonusDecorator.DecoratorClasses.TomatoDecorator;
import Decorator.BonusDecorator.Hamburger;
import Decorator.BonusDecorator.Interface.Sandwich;
import Decorator.DecoratorClasses.MozzarellaDecorator;
import Decorator.DecoratorClasses.TuscanyDecorator;
import Decorator.Interfaces.Pizza;
import Decorator.SimplePizza;
import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest() {
        Pizza pizza = new TuscanyDecorator(
                new MozzarellaDecorator(new SimplePizza()));

        Assert.assertEquals(
                "Base + Mozzarella + Tuscany", pizza.make());
    }
    @Test
    public void decorateSandwichTest() {
        Sandwich sandwich = new OnionsDecorator(
                new TomatoDecorator(
                        new BeefDecorator(
                                new Hamburger()
                        )
                )
        );
        Assert.assertEquals(
                "Hamburger + Beef + Tomato + Onions",
                sandwich.make());
    }

}
