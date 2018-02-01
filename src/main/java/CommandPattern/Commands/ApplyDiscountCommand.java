package CommandPattern.Commands;

import CommandPattern.Entities.Discount;
import CommandPattern.Interface.Command;

public class ApplyDiscountCommand implements Command {

    private Discount discount;

    public ApplyDiscountCommand(Discount discount) {
        this.discount = discount;
    }

    @Override
    public void execute() {
        if (discount.isEligible())
            discount.applyDiscount();
    }
}

