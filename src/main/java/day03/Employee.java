package day03;

public class Employee {

    public String experience;
    public double salary;
    public int daysWorked;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String experience, int daysWorked){
        this.experience = experience;
        this.daysWorked = daysWorked;
    }

    public static void calculateEarnings(double salary){
        System.out.println("I am about to start making " + salary + " dollars per hour.");
    }

}
