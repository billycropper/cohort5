package day08.animalHierarchy;

public class RoboDog extends Robot implements Pet {

    public RoboDog(String name, String breed, String food) {
        super(name, breed, food);
    }

    public String eat(){
        return getBreed() + "shoots laser beams";
    }
}
