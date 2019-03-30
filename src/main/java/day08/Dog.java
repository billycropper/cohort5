package day08;

public class Dog extends Canine implements IGreet{


    public Dog(String name, String food, String breed) {
        super(name, food);
        this.breed = breed;
    }

    @Override
    public String eat() {
        return breed + "'s eats cats";
    }

    @Override
    public void greetMaster() {
        System.out.println("Sniff you and wag tail");
    }

//    @Override
//    public String eat() {
//        return breed + "'s cats";
//    }


}

