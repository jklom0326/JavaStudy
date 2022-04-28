package Chapter02.Part09;

public class Student {
    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();

    }
    public void setKorean(String name, int score) {
        korea.subjectName = name;
        korea.Score = score;
    }

    public void setMath(String name, int score) {
        math.subjectName = name;
        math.Score = score;
    }

    public void showStudentScore(){
        int total = korea.Score + math.Score;

        System.out.println(studentName+"학생의 총점은 " +total+"점입니다.");
    }
}
