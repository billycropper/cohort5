package day06;

public class Square {

    private int side;

    public Square() {

    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int calculateArea(){
        int area = side * side;
        return area;
    }
}
