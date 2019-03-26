package day06;

public class Circle {
    // area = pi * radius * radius
    private double pi = Math.PI;
    private double radius;

    public Circle() {

    }

    public double calculateArea(){
        double area = pi * Math.pow(radius, radius);
        return area;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
