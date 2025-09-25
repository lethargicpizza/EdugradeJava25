package polymorfism;

public class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void playRadio() {
        System.out.println("Playing radio ...");
    }
}
