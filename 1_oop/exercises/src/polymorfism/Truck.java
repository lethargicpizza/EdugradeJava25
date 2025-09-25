package polymorfism;

public class Truck extends Vehicle {
    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    public void loadCargo() {
        System.out.println("Loading Cargo...");
    }
}
