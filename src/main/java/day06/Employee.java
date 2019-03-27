package day06;

public class Employee {

    private String name;
    private int salary;
    protected String nickName;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(int x){
        salary = salary + x;
        return salary;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Salary: " + this.salary;
    }

    public void printName(){
        System.out.println("The employee name is " + name);
    }

    public String printName(String nickName){
        System.out.println("The employee name is " + name + " and the employee nickname is " + nickName);
        return name;
    }
}
