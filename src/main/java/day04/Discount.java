package day04;

public class Discount {

    public double calculateDiscount(double price, double dis){
        double percent = dis / 100;
        double y = price * percent;
        double x = price - y;
        System.out.println("The price is " + x);
        return x;
    }

    public Discount() {

    }

    @Override
    public String toString() {
        return "Discount{}";
    }
}
