package day08.animalHierarchy;

public class Lion extends Feline {

    public Lion(String name, String food) {
        super(name, food);
    }

    public String eat(){
        return getBreed() + "eat's hippos";
    }
}
