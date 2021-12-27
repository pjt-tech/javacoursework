package chapter2.ch09;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        this.korea = new Subject();
        this.math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMethSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() {

        int total = korea.score + math.score;
        System.out.println(studentName+"학생의 총점은 " + total + "점 입니다.");
    }
}
