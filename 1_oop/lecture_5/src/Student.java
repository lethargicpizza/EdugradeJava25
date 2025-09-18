public class Student {
    private String name, grade;
    private int age;

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        if (grade == "A" || grade == "B" || grade == "C" || grade == "D" || grade == "E" || grade == "F") {
            this.grade = grade;
        }
        else {
            System.out.println("Invalid grade.");
        }
    }
}
