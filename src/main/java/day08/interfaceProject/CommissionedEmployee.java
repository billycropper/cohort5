package day08.interfaceProject;

public class CommissionedEmployee extends Employee {

    private double commissionRate;
    private double grossSales;

    public CommissionedEmployee(String firstName, String lastName, int social, double commissionRate, double grossSales) {
        super(firstName, lastName, social);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double calculatePay(){
        double pay;
        return pay = commissionRate * grossSales;
    }
}
