package day06;

public class MortgageLoan extends Loan {

    public double calculateMortgage(){
        double added = calculateLoan();
        double price = getBasePrice() + added;
        return price;
    }
}
