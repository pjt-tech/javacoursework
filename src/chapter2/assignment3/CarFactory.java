package chapter2.assignment3;

public class CarFactory {

    private final static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar(String name) {
        return new Car(name);
    }
}
