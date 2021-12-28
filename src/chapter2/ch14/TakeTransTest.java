package chapter2.ch14;

public class TakeTransTest {

    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Bus bus = new Bus(100);
        james.takeBus(bus);

        Subway greenSubway = new Subway(2);
        tomas.takeSubway(greenSubway);

        james.showInfo();
        tomas.showInfo();

        bus.showBusInfo();
        greenSubway.showSubwayInfo();
    }
}
