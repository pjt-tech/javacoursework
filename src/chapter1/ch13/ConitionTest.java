package chapter1.ch13;

import java.util.Scanner;

public class ConitionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num > num2) ? num : num2;
        System.out.println("max = " + max);
    }
}
