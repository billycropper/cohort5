package day06;

public class Main {
    public static void main(String[] args) {

        Shape hello = new Shape();
        hello.setLength(5);
        hello.setSide(6);
        hello.setWidth(7);
        hello.getLength();
        hello.getSide();
        hello.getWidth();
        System.out.println("The area is: " + hello.calculateArea());

        Square size = new Square();
        size.setSide(10);
        size.getSide();
        System.out.println("The area is: " + size.calculateArea());

        Triangle size2 = new Triangle();
        size2.setBase(30);
        size2.setHeight(10);
        size2.getBase();
        size2.getHeight();
        System.out.println("The area is: " + size2.calculateArea());

        Circle size3 = new Circle();
        size3.setRadius(5);
        size3.getRadius();
        System.out.println("The area is: " + size3.calculateArea());

        CarLoan car = new CarLoan();
        car.setBasePrice(50000.00);
        car.setIntrestRate(.095);
        car.setYears(9.0);
        System.out.println("The total price of the car is " + car.calculateCarLoan());

        HomeImporovementLoan home = new HomeImporovementLoan();
        home.setBasePrice(100000.00);
        home.setIntrestRate(.010);
        home.setYears(30.0);
        System.out.println("The total price of the repair is " + home.calculateImprovLoan());

        MortgageLoan mort = new MortgageLoan();
        mort.setBasePrice(300000.00);
        mort.setIntrestRate(.020);
        mort.setYears(30.0);
        System.out.println("The total price of the house is " + mort.calculateMortgage());

    }
}
