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

    }
}
