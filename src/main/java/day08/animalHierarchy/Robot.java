package day08.animalHierarchy;

public abstract class Robot {

    private String name;
    private String breed;
    private String food;

    public Robot(String name, String breed, String food) {
        this.name = name;
        this.breed = breed;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract String eat();
}
