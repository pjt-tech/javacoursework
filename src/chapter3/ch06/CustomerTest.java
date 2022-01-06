package chapter3.ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1000,"customer1"));
        customers.add(new Customer(1001,"customer2"));
        customers.add(new VIPCustomer(1002,"customer3"));
        customers.add(new VIPCustomer(1003,"customer4"));
        customers.add(new GoldCustomer(1004,"customer5"));

        for (Customer customer : customers) {
            int price = customer.calcPrice(10000);
            System.out.println(customer.showCustomerInfo() + " " + price);
        }
    }
}
