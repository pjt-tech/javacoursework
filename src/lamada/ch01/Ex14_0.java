package lamada.ch01;

public class Ex14_0 {

    public static void main(String[] args) {
        MyFunction2 myFunction2 = new MyFunction2() {
            @Override
            public int max(int a, int b) {
                return a > b ? a:b;
            }
        };


        MyFunction2 myFunction = (a,b) -> a > b?a:b;

        int value = myFunction.max(2, 3);
        System.out.println("value = " + value);
    }
}

@FunctionalInterface //함수형 인터페이스 명시 , 단 하나의 추상메스드만 가져야 함
interface MyFunction2 {
    int max(int a, int b);
}
