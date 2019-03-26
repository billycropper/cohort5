package day06;

public class Loan {

    private double intrestRate;
    private double years;
    private double basePrice;

    public Loan() {

    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getYears() {
        return years;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculateLoan(){
        double answer = basePrice * intrestRate * years;
        return answer;
    }
}
