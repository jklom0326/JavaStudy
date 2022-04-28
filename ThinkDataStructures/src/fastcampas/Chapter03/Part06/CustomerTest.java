package Chapter03.Part06;

import java.sql.Array;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customersList = new ArrayList<>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerJ = new Customer(10020, "James");
        Customer customerE = new GoldCustomer(10030, "Edward");
        Customer customerP = new GoldCustomer(10040, "Percy");
        Customer customerK = new VIPCustomer(10050, "Kim");

        customersList.add(customerE);
        customersList.add(customerT);
        customersList.add(customerJ);
        customersList.add(customerP);
        customersList.add(customerK);

        for (Customer customer : customersList){
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customersList) {
            int cost = customer.calcPoint(price);
            System.out.println(customer.customerName+ "님이 " + cost+ "원을 지불하셨습니다.");
            System.out.println(customer.customerName+ "님의 현재 보너스 포인트는 " + customer.bonusPoint+ " 입니다.");
        }
    }
}
