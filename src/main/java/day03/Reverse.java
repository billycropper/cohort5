package day03;

import java.util.Scanner;

public class Reverse {

    public static void back(){

        System.out.println("Please enter string");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String x = "";
        for(int i = str.length() - 1; i >= 0; i--){
            x = x + str.charAt(i);
        }
        System.out.println(x);
    }

}