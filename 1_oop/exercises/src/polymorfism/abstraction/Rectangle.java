package polymorfism.abstraction;

public class Rectangle extends Shape {
    double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calcutadeArea() {
        return width * height;
    }

}
