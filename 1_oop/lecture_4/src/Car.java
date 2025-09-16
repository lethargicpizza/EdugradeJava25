public class Car {
    String brand;
    String model;
    int year;

    // Tom konstruktor
    public Car() {}

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    void startEngine() {
        System.out.println("Engine started");
    }

    void info() {
        System.out.println("Car info: " + brand + ", " + model + ", " +year);
    }
}
