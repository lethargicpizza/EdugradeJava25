public class Student {
    private String name, grade;
    private int age;

    public Student(String name, String grade, int age) {
        this.name = name;

        if (grade == "A" || grade == "B" || grade == "C" || grade == "D"  || grade == "E"|| grade == "F") {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
            this.grade = "N/A";
        }
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
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
        if (grade == "A" || grade == "B" || grade == "C" || grade == "D"  || grade == "E"|| grade == "F") {
            this.grade = grade;
        } else  {
            System.out.println("Invalid grade");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }
    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
    }
}
