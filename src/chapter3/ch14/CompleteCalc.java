package chapter3.ch14;

import static chapter3.ch14.Calc.ERROR;

public class CompleteCalc extends Calculator implements Calc {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if(num2 == 0) {
            return Calc.ERROR;
        }
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현");
    }


}
