package chapter2.ch06;

public class Student {

    int studentNumber;
    String studentName;
    int grade;

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return studentNumber + "학번의 학생 이름은 " + studentName + "이고, " + grade + "학년 입니다.";
    }
}
