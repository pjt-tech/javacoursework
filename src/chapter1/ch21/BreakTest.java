package chapter1.ch21;

public class BreakTest {

    public static void main(String[] args) {
        int sum = 0;
        int i;
        for( i = 1; ; i++) {
            sum += i;
            if(sum >= 100) {
                break;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("i = " + i);
    }
}
