package day08.interfaceProject;

public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int social, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, social);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay(){
        double pay = hourlyWage * hoursWorked;
        double overTimePay;
        double overTimeRate = hourlyWage * 1.5;
        double overTimeHours;
        double totalPay;
        if (hoursWorked > 40){
            overTimeHours = hoursWorked - 40;
            overTimePay = overTimeHours * overTimeRate;
            totalPay = pay + overTimePay;
        } else{
            totalPay = pay;
        } return totalPay;

//        double overTime;
//        double pay;
//        double otPay;
//        if(hoursWorked > 40){

        }
    }

