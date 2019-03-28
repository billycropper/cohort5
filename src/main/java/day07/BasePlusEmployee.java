package day07;

public class BasePlusEmployee extends CommissionedEmployee {

    private int baseSalary;

    public BasePlusEmployee(){

    }

    public BasePlusEmployee(int baseSalary, int grossSales, int comissionRate, int employeeID, String firstName, String lastName){
        this.baseSalary = baseSalary;
        setGrossSales(grossSales);
        setComissionRate(comissionRate);
        setEmployeeID(employeeID);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int paycheck(){
        return (getComissionRate() * getGrossSales()) + baseSalary;
    }

}
