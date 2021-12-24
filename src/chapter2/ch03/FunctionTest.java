package chapter2.ch03;

public class FunctionTest {

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println("total = " + total);

        sayHello("hello!!");

        total = calcSum();
        System.out.println("total = " + total);
    }
}
