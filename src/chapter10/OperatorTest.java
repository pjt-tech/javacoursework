package chapter10;

public class OperatorTest {

    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = gameScore++;

        System.out.println("lastScore = " + lastScore);
        System.out.println("gameScore = " + gameScore);
    }
}
