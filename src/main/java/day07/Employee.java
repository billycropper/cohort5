package day07;

public class Employee {

    private String firstName;
    private String lastName;
    private int employeeID;

    public Employee(String firstName, String lastName, int employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public int paycheck(int amount){
        return amount;
    }
}
