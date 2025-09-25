package polymorfism.abstraction;

public class Lecture_7 {
    public static void main(String[] args) {
        // Övning 3.1:
        Circle c = new Circle(5);
        System.out.println("Area: " + c.calcutadeArea());

        Rectangle r = new Rectangle(5,5);
        System.out.println("Area: " + r.calcutadeArea());


        // Övning 4.1:
        FullTimeEmployee full = new FullTimeEmployee("Per", 45000);
        System.out.println("Full Time Employee: " + full.calculateSalary());

        PartTimeEmployee part = new PartTimeEmployee("Carl", 250, 165);
        System.out.println("Part Time Employee: " + part.calculateSalary());


        // Övning 4.2:
        full.pay();
        part.pay();
    }
}
