package CommandPattern.Commands;

import CommandPattern.Entities.GoalDiscount;
import CommandPattern.Interface.Command;

public class ApplyGoalDiscountCommand implements Command {

    private GoalDiscount goalDiscount;

    public ApplyGoalDiscountCommand(GoalDiscount goalDiscount) {
        this.goalDiscount = goalDiscount;
    }

    @Override
    public void execute() {
        if (goalDiscount.isPricePaidMatched())
            goalDiscount.applyDiscount();
    }
}
