package day08.animalHierarchy;

public class Hippo extends Animal {

    public Hippo(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getBreed() + "eat's humans";

    }
}
