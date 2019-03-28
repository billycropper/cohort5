package day07;

public class Triangle extends Shape {

    public Triangle(int width, int height, int length){
        super(width, height);
        this.length = length;
    }

    @Override
    public int equation(){
        int x = length * (getWidth() * getHeight());
        return x;
    }
}
