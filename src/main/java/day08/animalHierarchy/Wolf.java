package day08.animalHierarchy;

public class Wolf extends Canine {

    public Wolf(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getBreed() + "eats lions";
    }
}
