public class SimpleCalculator {
    private double tal1, tal2;

    public SimpleCalculator(double a, double b) {
        tal1 = a;
        tal2 = b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double mul(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }
}
