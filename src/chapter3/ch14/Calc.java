package chapter3.ch14;

public interface Calc {

    //static final로 compile 시점에 변경됨.
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int div(int num1, int num2);

    default void description() {
        System.out.println("정수의 사직연산을 제공");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("private method");
    }

    private static void myStaticMethod() {
        System.out.println("private static method");
    }
}
