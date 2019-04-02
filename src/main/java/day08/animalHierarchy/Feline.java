package day08.animalHierarchy;

public abstract class Feline extends Animal {

    public Feline(String name, String food) {
        super(name, food);
    }

    public abstract String eat();
}
