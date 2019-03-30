package day08.interfaceProject;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int social, double salary) {
        super(firstName, lastName, social);
        this.weeklySalary = salary;
    }

    @Override
    public double calculatePay(){
        return weeklySalary;
    }
}
