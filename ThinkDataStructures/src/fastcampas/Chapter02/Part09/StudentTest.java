package Chapter02.Part09;

public class StudentTest {

    public static void main(String[] args) {

        Student studentHan = new Student(1,"Hans");
        studentHan.setMath("수학", 95);
        studentHan.setKorean("국어", 95);

        Student studentUm = new Student(2,"Um");
        studentUm.setMath("수학", 90);
        studentUm.setKorean("국어", 100);

        studentHan.showStudentScore();
        studentUm.showStudentScore();
    }
}
