package Chapter03.Part03;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        setCustomerGrade("VIP");
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VIPCustomer() call");
    }

    public int getAgentID() {
        return agentID;
    }
}
