package day06;

public class HomeImporovementLoan extends Loan{

    public double calculateImprovLoan(){
        double added = calculateLoan();
        double price = getBasePrice() + added;
        return price;
    }
}
