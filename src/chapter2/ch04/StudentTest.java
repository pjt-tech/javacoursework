package chapter2.ch04;

public class StudentTest {

    public static void main(String[] args) {
        Student studentPark = new Student();

        studentPark.studentId = 12345;
        studentPark.setStudentName("Park");
        studentPark.address = "인천광역시 부평구";

        studentPark.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 강남구";

        studentKim.showStudentInfo();

    }
}
