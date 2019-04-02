package day08.animalHierarchy;

public class Agent extends Robot {

    public Agent(String name, String breed, String food) {
        super(name, breed, food);
    }

    public String eat(){
        return getBreed() + "Kills robodog";
    }
}
