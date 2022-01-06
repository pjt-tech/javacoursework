package chapter3.ch06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    /*public VIPCustomer() {
        super(1000, "김유신");
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIP Customer() call");
    }*/

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
