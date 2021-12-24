package chapter2.ch06;

import chapter2.ch06.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student studentPark = new Student(1234,"Park",3);
        String info = studentPark.showStudentInfo();
        System.out.println("info = " + info);

    }
}
