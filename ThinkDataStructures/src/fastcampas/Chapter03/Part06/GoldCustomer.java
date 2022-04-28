package Chapter03.Part06;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPoint(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
