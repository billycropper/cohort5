package day08.interfaceProject;

public class HireDate {

    private int month;
    private int day;
    private int year;

    public HireDate() {
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String makeDate(int month, int day, int year){
        return month + "-" + day + "-" + year;
    }
}
