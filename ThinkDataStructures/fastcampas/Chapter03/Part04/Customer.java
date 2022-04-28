package Chapter03.Part04;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(int customerId, String customerName) {

        this.customerId = customerId;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.5;
    }

    public int calcPoint(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerId;
    }

    public void setCustomerID(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customername) {
        this.customerName = customername;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
