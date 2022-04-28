package Chapter03.Part06;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calcPoint(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price *saleRatio);
        return price;
    }

    public int getAgentID() {
        return agentID;
    }
}
