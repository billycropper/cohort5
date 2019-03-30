package day08;

public class Main {
    public static void main(String[] args) {

        RoboDog roboDog = new RoboDog();

        Cat cat = new Cat("tami","catfish");
        System.out.println("cat 1" + cat);

        Dog dog = new Dog("waka flocka","bones", "German Shepard");

        Animal[] animals = new Animal[]{cat, dog};

        for (Animal animal : animals) {
            System.out.println(animal.eat());
        }

//        IGreet[] iGreet = new IGreet[]{dog, roboDog};
//        for(IGreet greet : iGreet){
//            System.out.println(iGreet.g);
//        }

    }
}
