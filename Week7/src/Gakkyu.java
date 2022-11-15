import java.util.ArrayList;

public class Gakkyu {
    String teacherName;
    ArrayList<Student> students;

    Gakkyu(String teacherName) {
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
    }

    void add(Student student) {
        this.students.add(student);
    }

    int average() {
        int sum = 0;
        for (Student student : students) {
            sum += student.totalScore();
        }
        return sum / students.size();
    }
}
