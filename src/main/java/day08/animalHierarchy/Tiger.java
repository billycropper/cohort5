package day08.animalHierarchy;

public class Tiger extends Feline {

    public Tiger(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getBreed() + "eats wolfs";
    }
}
