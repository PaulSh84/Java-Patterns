package CommandPattern.Commands;

import CommandPattern.Entities.Discount;
import CommandPattern.Interface.Command;

import java.util.List;

public class ApplyAllDiscountsCommand implements Command {

    private List<? extends Discount> discounts;

    public ApplyAllDiscountsCommand(List<? extends Discount> discounts) {
        this.discounts = discounts;
    }

    @Override
    public void execute() {
        discounts.forEach(e -> new ApplyDiscountCommand(e).execute());
    }

}
