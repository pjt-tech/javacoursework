package chapter3.ch11;

public interface Calc {

    //static final로 compile 시점에 변경됨.
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int div(int num1, int num2);
}
