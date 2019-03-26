package day06;

public class CarLoan extends Loan {

    public double calculateCarLoan(){
        double added = calculateLoan();
        double price = getBasePrice() + added;
        return price;
    }
}
