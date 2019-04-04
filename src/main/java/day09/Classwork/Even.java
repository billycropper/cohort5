package day09.Classwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class Even {

    public static void main(String[] args) {

        ArrayList<Integer> even = new ArrayList<>();
        even.add(1);
        even.add(10);
        even.add(111);
        even.add(1101);
        even.add(12);

        Iterator<Integer> evenIterator = even.iterator();

        for(Integer i : even) {
            while (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }

        while(evenIterator.hasNext()){
            int result = evenIterator.next();
            if(result % 2 == 0){
                System.out.println(result);
            }
        }

        while(evenIterator.hasNext()){
            if(evenIterator.next() % 2 != 0){
                evenIterator.remove();
                System.out.println(evenIterator);
            }
        }


    }


}
