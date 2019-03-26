package day06;

public class Shape {

    private int length;
    private int width;
    private int side;

    public int calculateArea(){


        int y = length + width + side;
        return y;

    }

    public Shape() {

    }

    public Shape(int length, int width, int side) {
        this.length = length;
        this.width = width;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                ", side=" + side +
                '}';
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public int getSide(){
        return this.side;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setSide(int side){
        this.side = side;
    }
}
