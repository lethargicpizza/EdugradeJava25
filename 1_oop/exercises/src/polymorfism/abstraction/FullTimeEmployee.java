package polymorfism.abstraction;

public class FullTimeEmployee extends Employee implements Payable {
private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void pay() {
        System.out.println("Payment for " + name + ": " + calculateSalary());
    }
}
