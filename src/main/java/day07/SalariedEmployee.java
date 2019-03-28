package day07;

public class SalariedEmployee extends Employee {

    private int weeklySalary;

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public int paycheck(){
        return weeklySalary;
    }
}
