package day08.animalHierarchy;

public class Dog extends Canine {

    public Dog(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getBreed() + "eat's cats";
    }
}
