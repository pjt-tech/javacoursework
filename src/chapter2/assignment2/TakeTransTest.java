package chapter2.assignment2;

public class TakeTransTest {

    public static void main(String[] args) {
        Person edward = new Person("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        edward.takeTaxi(taxi);
        edward.showInfo();
        taxi.showTaxiInfo();
    }
}
