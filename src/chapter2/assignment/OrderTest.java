package chapter2.assignment;

import java.time.LocalDateTime;

public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order(21232, "010-7443-9223", "인천광역시 부평구", LocalDateTime.now(), LocalDateTime.now(), 20000, 0003);
        order.orderInfo();
    }
}