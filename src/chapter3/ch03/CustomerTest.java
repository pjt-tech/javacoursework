package chapter3.ch03;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerPark = new Customer(1001,"박진태");
        customerPark.bonusPoint = 1000;
        System.out.println(customerPark.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(1002, "김예은");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
