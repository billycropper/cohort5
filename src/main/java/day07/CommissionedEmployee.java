package day07;

public class CommissionedEmployee extends Employee {

    private int grossSales;
    private int comissionRate;

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(int comissionRate) {
        this.comissionRate = comissionRate;
    }

    public int paycheck(int grossSales, int comissionRate){
        int x = comissionRate * grossSales;
        return x;
    }

    public CommissionedEmployee(int grossSales, int comissionRate, int employeeID, String firstName, String lastName){
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
        setEmployeeID(employeeID);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public CommissionedEmployee(){

    }

}
