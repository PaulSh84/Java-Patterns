import CommandPattern.CommandInvoker;
import CommandPattern.Commands.ApplyAllDiscountsCommand;
import CommandPattern.Entities.Discount;
import CommandPattern.Entities.GoalDiscount;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommandTest {

    @Test
    public void applyCommandTest() {
        List<Discount> discounts = mockDiscounts();

        ApplyAllDiscountsCommand command = new ApplyAllDiscountsCommand(discounts);

        CommandInvoker invoker = new CommandInvoker(command);
        invoker.execute();

        Assert.assertTrue(discounts.get(0).isDiscountApplied());
        Assert.assertFalse(discounts.get(1).isDiscountApplied());
        Assert.assertTrue(discounts.get(2).isDiscountApplied());
        Assert.assertFalse(discounts.get(3).isDiscountApplied());
    }

    private List<Discount> mockDiscounts() {
        return Arrays.asList(new Discount(true),
                new Discount(false),
                new Discount(true),
                new Discount(false));
    }

    private List<GoalDiscount> mockGoalDiscounts() {
        return Arrays.asList(new GoalDiscount(true, true),
                new GoalDiscount(false, false),
                new GoalDiscount(true, false),
                new GoalDiscount(false, false));
    }

    @Test
    public void applyGoalDiscountTest() {
        List<GoalDiscount> discounts = mockGoalDiscounts();

        ApplyAllDiscountsCommand command = new ApplyAllDiscountsCommand(discounts);
        CommandInvoker invoker = new CommandInvoker(command);
        invoker.execute();

        Assert.assertTrue(discounts.get(0).isDiscountApplied());
        Assert.assertFalse(discounts.get(1).isDiscountApplied());
        Assert.assertTrue(discounts.get(2).isDiscountApplied());
        Assert.assertFalse(discounts.get(3).isDiscountApplied());
    }


}
