package lecture_3.src;

public class Person {
    String name;
    int age;
    String occupation;

    public Person() {
        this.name = "Unknown";
        this.age = -1;
        this.occupation = "Unknown";
    }

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void introduce() {
        System.out.println("Namn: "+name);
        System.out.println("Ålder: "+age);
        System.out.println("Yrke: "+occupation);
    }
}
