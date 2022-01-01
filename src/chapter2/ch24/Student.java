package chapter2.ch24;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;

    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName,score));
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
            System.out.println("학생" + studentName + "의 " +subject.getSubjectName()+"과목 성적은 " + subject.getScore() + "입니다.");
        }
        System.out.println(studentName+ "학생의 총점은 " + total + "점 입니다.");
        System.out.println(studentName+ "학생의 평균은 " + (float)total/subjects.size() + "입니다.");
    }
}
