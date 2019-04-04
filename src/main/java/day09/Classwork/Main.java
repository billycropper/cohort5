package day09.Classwork;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;

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

        System.out.println("==================================");

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();

        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        System.out.println("==================================");

        ArrayList<Double> dub = new ArrayList();
        dub.add(2.0);
        dub.add(1.0);
        dub.add(3.0);
        dub.add(10.0);

        System.out.println(dub);

        dub.remove(1);
        dub.size();
        System.out.println(dub.lastIndexOf(dub));
        System.out.println(dub);

        Iterator<Double> dubIterator = dub.iterator();

        while(dubIterator.hasNext()){
            Double result = dubIterator.next();
            System.out.println(result);
        }

        for(double i : dub){
            System.out.println(i);
        }

        ListIterator<Double> dubListIterator = dub.listIterator(dub.size());
        while(dubListIterator.hasPrevious()){
            Double result = dubListIterator.previous();
            System.out.println(result);
        }


        System.out.println("==================================");

        Iterator<String> animalIterator = animals.iterator();

        while(animalIterator.hasNext()){
            String result = animalIterator.next();
            System.out.println(result);
        }

        ListIterator<String> animalListIterator = animals.listIterator(animals.size());
        while(animalListIterator.hasPrevious()){
            String result = animalListIterator.previous();
            System.out.println(result);
        }

        System.out.println("==================================");

        HashMap<Integer, String> gradeBook = new HashMap<>();

        gradeBook.put(100, "William Cropper");
        gradeBook.put(22, "Damon Miller");
        gradeBook.put(85, "Jack Beatson");

        System.out.println(gradeBook.get(22));
        System.out.println(gradeBook.keySet());

        for(Integer key : gradeBook.keySet()){
            System.out.println(gradeBook.get(key));
        }

        HashMap<Integer, Student> people = new HashMap<>();

        people.put(10, new Student("Damon", 22));
        people.put(20, new Student("Jack", 23));
        people.put(30, new Student("Justin", 20));

        for(Map.Entry i : people.entrySet()){
            System.out.println("{\n" + " " + i.getKey() + " : " + i.getValue() + "\n}");
        }

        System.out.println('\n');
        System.out.println(people.containsKey(20));
        people.replace(30, new Student("Billy",40));

        System.out.println(people);


    }
}
