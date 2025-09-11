package lecture_3.src;

public class Objekt {
    public static void main(String[] args) {
        Person person = new Person("Erik", 30, "Teacher");
        person.introduce();

        Person unknown = new Person();
        unknown.introduce();

        Rectangle rectangle = new Rectangle(20, 20);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Circle circle = new Circle(30);
        circle.calculateCircumreference();
    }

}

