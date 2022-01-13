package chapter3.ch14;


public class CalcTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.div(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.sub(num1,num2));

        calc.description();

        int total = Calc.total(new int[]{1, 2, 3});
        System.out.println(total);
    }
}
