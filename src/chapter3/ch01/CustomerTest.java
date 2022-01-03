package chapter3.ch01;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerPark = new Customer();
        customerPark.setCustomerName("박진태");
        customerPark.setCustomerID(1001);
        customerPark.bonusPoint = 1000;

        System.out.println(customerPark.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김예은");
        customerKim.setCustomerID(1002);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
