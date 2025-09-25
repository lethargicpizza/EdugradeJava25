package polymorfism;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    public void popWheelie() {
        System.out.println("Popping wheelie");
    }

}
