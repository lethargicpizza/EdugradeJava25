import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String courseName;
    private Student[] students;
    private int studentCount = 0;
    private int maxStudents = 30;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[maxStudents];
    }

    public void addStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Kursen är full!");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentsWithGrades(String grade) {
        List<Student> studentsWithGrade = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrade().equals(grade)) {
                studentsWithGrade.add(students[i]);
            }
        }
        return studentsWithGrade;
    }
}
