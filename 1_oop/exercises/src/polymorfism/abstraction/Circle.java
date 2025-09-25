package polymorfism.abstraction;

public class Circle extends Shape {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calcutadeArea() {
        return Math.PI * radius  * radius;
    }
}
