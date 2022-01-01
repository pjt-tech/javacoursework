package chapter2.ch24;

public class StudentTest {

    public static void main(String[] args) {
        Student studentPark = new Student(1001, "Jin");

        studentPark.addSubject("국어", 100);
        studentPark.addSubject("수학", 100);
        studentPark.addSubject("영어", 100);

        Student studentKim = new Student(1002, "Tae");

        studentKim.addSubject("국어", 80);
        studentKim.addSubject("수학", 80);
        studentKim.addSubject("영어", 90);

        studentPark.showStudentInfo();
        System.out.println("======================================");
        studentKim.showStudentInfo();
    }
}
