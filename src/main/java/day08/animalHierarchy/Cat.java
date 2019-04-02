package day08.animalHierarchy;

public class Cat extends Feline implements Pet {

    public Cat(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getName() + "eat's dogs";
    }
}
