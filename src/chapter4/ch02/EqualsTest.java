package chapter4.ch02;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        Student cloneStd = (Student) std1.clone();
        System.out.println(cloneStd);
    }
}
