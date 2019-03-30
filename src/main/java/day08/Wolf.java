package day08;

public class Wolf extends Canine{

    public Wolf(String name, String food){
        super(name, food);
    }

    public String eat(){
        return "Wolfs eat blood";
    }
}
