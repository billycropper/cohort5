package day08;

public abstract class Animal {

    private String name;
    private String food;
    protected String breed;


    //constructor
    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }


//    public String getFood() {
//        return food;
//    }
//
//    public void setFood(String food) {
//        this.food = food;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    //Methods
    abstract public String eat();

//    //// polymorphic method - demo with parameter
//    public void printAnimalName(Animal animal){
//        System.out.println("The animal's name is " + animal.getName());
//    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }


}