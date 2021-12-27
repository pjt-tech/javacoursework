package chapter2.ch09;

public class SubjectTest {

    public static void main(String[] args) {
        Student student = new Student(100, "park");
        student.setKoreaSubject("국어", 80);
        student.setMethSubject("수학", 100);

        Student studentKim = new Student(100, "Kim");
        studentKim.setKoreaSubject("국어", 100);
        studentKim.setMethSubject("수학", 100);

        student.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
