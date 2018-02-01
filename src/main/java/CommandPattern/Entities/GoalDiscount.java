package CommandPattern.Entities;

public class GoalDiscount extends Discount {

    private boolean pricePaidMatched;

    public GoalDiscount(boolean eligible, boolean pricePaidMatched) {
        super(eligible);
        this.pricePaidMatched = pricePaidMatched;
    }

    public boolean isPricePaidMatched() {
        return pricePaidMatched;
    }

    @Override
    public void applyDiscount() {
        discountApplied = true;
        System.out.println("GoalDiscount applied");
    }
}
