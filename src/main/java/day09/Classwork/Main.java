package day09.Classwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.remove(2);
        System.out.println(animals);

        animals.add("Dog");

        System.out.println(animals.size());
        System.out.println("Is out list empty?: " + animals.isEmpty());
        animals.add(2,"Elephant");
        System.out.println(animals);

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();

        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        ArrayList<Double> dub = new ArrayList();
        dub.add(2.0);
        dub.add(1.0);
        dub.add(3.0);
        dub.add(10.0);

        System.out.println(dub);


    }
}
