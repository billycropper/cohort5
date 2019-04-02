package day08.animalHierarchy;

public class Main {
    public static void main(String[] args) {

        Hippo hippo = new Hippo("Hippo", "Male");
        Cat cat = new Cat("Cat", "Female");

        Animal[] animals = new Animal[]{hippo, cat};

        for (Animal pet : animals) {
            System.out.println(pet.eat());
        }

//    for(IGreet greet : iGreet){
//        greet.greetMaster();
//    }
    }

}
