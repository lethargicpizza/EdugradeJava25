import java.util.List;
import java.util.ArrayList;

public class School {
    private List<Student>  students;
    private Teacher[] teachers;;
    private int teacherCount;

    public School(int teacherSize)  {
        this.teachers = new Teacher[teacherSize];
        this.students = new ArrayList<>();
        this.teacherCount = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacherCount < teachers.length) {
            this.teachers[teacherCount] = teacher;
            teacherCount++;
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listTeachers() {
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i].getName());
        }
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
