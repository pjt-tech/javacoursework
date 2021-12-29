package chapter2.assignment3;

public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar("sonata");
        Car yourSonata = factory.createCar("sonata2");

        System.out.println(mySonata.getCarName() +"의 차번호는 " + mySonata.getCarNum());
        System.out.println(yourSonata.getCarName() +"의 차번호는 " + yourSonata.getCarNum());
    }
}
