public class Triangle {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public Triangle() {

    }

    public double calculateArea() {
        return (base * height) / 2;
    }
}
