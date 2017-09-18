package CommandPattern.Entities;

public class Discount {

    private boolean eligible;
    protected boolean discountApplied;


    public Discount(boolean eligible) {
        this.eligible = eligible;
    }

    public void applyDiscount() {
        discountApplied = true;
        System.out.println("Discount applied");
    }

    public boolean isEligible() {
        return eligible;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }
}
