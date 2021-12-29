package chapter2.assignment3;

public class Car {

    private static int serialNum = 1000;

    private String carName;
    private int carNum;

    public Car(String carName) {
        serialNum++;
        this.carName = carName;
        this.carNum = serialNum;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
