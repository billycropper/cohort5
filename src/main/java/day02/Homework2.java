package day02;

public class Homework2 {

    public void Zipcode2(int x) {

        while (x >= 1) {

            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("zipcode");
            } else if (x % 3 == 0) {
                System.out.println("zip");
            } else if(x % 5 == 0) {
                System.out.println("code");
            } else{
                System.out.println(x);
            }
         x--;

        }
    }
}
