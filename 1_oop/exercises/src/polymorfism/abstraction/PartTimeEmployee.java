package polymorfism.abstraction;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workingHours;

    public PartTimeEmployee(String name, int hourlyRate, int workingHours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }

    public void pay() {
        System.out.println("Payment for " + name + ": " + calculateSalary());
    }
}
