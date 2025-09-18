//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Book b = new Book("Liftarens guide", "Douglas Adams", 500);
        b.displayInfo();

        Triangle t = new Triangle(50, 50);
        System.out.println("Area: " + t.calculateArea());

        Student s = new Student("Per Nordenbrink", "A", 45);
        s.printDetails();
        s.setGrade("G");
        s.setGrade("A");

        Employee e = new Employee("Per Nordenbrink", "The Boss", 50000);
        e.printDetails();

        Car c = new Car("Volvo", "V70", 2013);
        c.printDetails();
    }
}