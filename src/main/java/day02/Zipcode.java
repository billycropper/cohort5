package day02;

import java.util.Scanner;

public class Zipcode {

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();

    public void zipNum() {
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("zipcode");
        } else if (a % 3 == 0) {
            System.out.println("zip");
        } else if(a % 5 == 0) {
            System.out.println("code");
        } else{
            System.out.println("error");
        }
    }
}
