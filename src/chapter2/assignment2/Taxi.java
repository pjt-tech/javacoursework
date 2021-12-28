package chapter2.assignment2;

public class Taxi {

    private String company;
    private int money;

    public Taxi(String company) {
        this.company = company;
    }

    public void take(int price) {
        this.money += price;
    }

    public void showTaxiInfo() {
        System.out.println(company + "택시 수입은 " + money + "원 입니다.");
    }
}
