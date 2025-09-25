package polymorfism;

public class Lecture_7 {
    public static void main(String[] args) {
        // Övning 1.1:
        Car c = new Car("Volvo", "V70", 2014);
        c.startEngine();
        c.playRadio();

        Motorcycle mc = new Motorcycle("Honda", "N/A", 2015);
        mc.startEngine();
        mc.popWheelie();

        // Övning 1.2
        Truck t = new Truck("Scania", "N/A", 2020);
        t.startEngine();
        t.loadCargo();
        t.stopEngine();

        // Övning 2.1
        Calculator calculator = new Calculator();
        System.out.println("Integers: " + calculator.multiply(2, 5));
        System.out.println("Doubles: " + calculator.multiply(2.5, 1.5));

        // Övning 2.2
        Shape shape = new Shape();
        shape.Draw();

        Circle circle = new Circle();
        circle.Draw();

        Rectangle rectangle = new Rectangle();
        rectangle.Draw();
    }
}
