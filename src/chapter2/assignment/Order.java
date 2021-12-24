package chapter2.assignment;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {

    private int orderNum;
    private String phoneNum;
    private String address;
    private LocalDateTime oderDate;
    private LocalDateTime orderTime;
    private int price;
    private int menuNum;

    public Order(int orderNum, String phoneNum, String address, LocalDateTime oderDate, LocalDateTime orderTime, int price, int menuNum) {
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.oderDate = oderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNum = menuNum;
    }

    public void orderInfo() {
        System.out.println("주문 접수 번호 : " + orderNum + "\n" +
                "주문 핸드폰 번호 : " + phoneNum + "\n" +
                "주문 집 주소 : "  + address + "\n" +
                "주문 날짜 : " + oderDate + "\n" +
                "주문 시간 : " + orderTime + "\n" +
                "주문 가격 : " + price + "\n" +
                "메뉴 번호 : " + menuNum);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getOderDate() {
        return oderDate;
    }

    public void setOderDate(LocalDateTime oderDate) {
        this.oderDate = oderDate;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }
}
