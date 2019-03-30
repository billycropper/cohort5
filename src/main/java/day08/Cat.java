package day08;

public class Cat extends Animal{

    public Cat(String name, String food) {
        super(name, food);
    }

    @Override
    public String eat(){
        return "cats eat fish";
    }
}