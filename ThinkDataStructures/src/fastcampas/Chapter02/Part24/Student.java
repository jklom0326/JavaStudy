package Chapter02.Part24;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studenID,String studentname){
        this.studentID = studenID;
        this.studentName = studentname;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject sub : subjectList){
            total += sub.getScore();
            System.out.println("학생"+ studentName+"의"+ sub.getName() + "과목 성적은" + sub.getScore()+"점 입니다.");
        }

        System.out.println("학생" + studentName + "의 총점은 "+total+"입니다.");
    }
}
