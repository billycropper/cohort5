package day06;

public class Manager extends Employee {

    private String managerTitle;

    public void setManagerTitle(String managerTitle) {
        this.managerTitle = managerTitle;
    }

    public String getManagerTitle(){
        return this.managerTitle;
    }

    public Manager(String managerTitle){
        this.managerTitle = managerTitle;

    }
}
