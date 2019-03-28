package day07;

public class Shape {

    private int width;
    private int height;
    protected int length;

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public Shape(int width, int height){
        this.width = width;
        this.height = height;

    }

    public int equation(){
        int x = width * height;
        return x;
    }
}
