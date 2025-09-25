package polymorfism;

public class Vehicle {
    private String make, model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting engine ...");
    }

    public void stopEngine() {
        System.out.println("Stopping engine ...");
    }
}
