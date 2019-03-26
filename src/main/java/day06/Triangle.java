package day06;

public class Triangle {

    private double base;
    private double height;

    public Triangle() {

    }

    public double calculateArea(){
        double area = 0.5 * (base * height);
        return area;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }
}
