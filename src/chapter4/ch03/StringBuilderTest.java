package chapter4.ch03;

public class StringBuilderTest {

    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        //Buffer 는 멀티쓰레드일때 사용한다.
        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(builder));
        builder.append(android);
        System.out.println(System.identityHashCode(builder));
        System.out.println(builder);
    }
}
