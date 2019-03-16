package day03;

import java.util.Scanner;

public class TwoInputs {

    public double solve(){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        double first = in.nextInt();
        System.out.println("Please enter second number");
        double second = in.nextInt();

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first * first);
        System.out.println(Math.sqrt(first));
        System.out.println(Math.pow(first, second));
        System.out.println(Math.sin(first));
        System.out.println(Math.cos(first));

        return first + second;
    }

}
