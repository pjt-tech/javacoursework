package chapter21;

public class ContinueTest {

    public static void main(String[] args) {
        //1부터 100까지 3의 배수

        int num;

        for(num =1; num <= 100; num++) {

            if((num % 3) != 0) continue;

            System.out.println(num);
        }
    }
}
