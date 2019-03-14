package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        char x = 'X';
        stringBuilder.append(x);
        System.out.println(stringBuilder);

        System.out.println("Hello world!");
        Vehicle car = new Vehicle(4,4);

        String all = String.join(" - ", "S", "M", "L", "XL");
        System.out.println(all);

        Scanner in = new Scanner(System.in);

        /*System.out.println("What is your name?");
        String name = in.nextLine();
        in.nextLine();
        System.out.println(name);

        System.out.println("What is your number?");
        int number = in.nextInt();
        in.nextLine();
        System.out.println(number);

        System.out.println("Where are you from?");
        String location = in.nextLine();
        in.nextLine();
        System.out.println(location);

        System.out.println("Your name is " + name + " and your number is " + number + " and you're from " + location);*/

        double y = 8.482910103948482;
        System.out.printf("%8.2f", y);

        double y2 = 8.99999999999;
        System.out.printf("%.2f", y2);

        String z = "Hello";
        System.out.printf("%10s", z);

        String a = "Hello";
        System.out.printf("%-10s", a);

        int x2 = 12345678;
        System.out.printf("%3d", x2);

        int x3 = 12345678;
        System.out.printf("%-3d", x3);

        int x4 = 10;
        System.out.printf("%5d", x4);

        int x5 = 10;
        System.out.printf("-%5d", x5);

        String str = String.format("The answer is %.8f", 8.777777777777);
        System.out.println(str);

        int value = 0;
        while(value < 10){
            System.out.println("Hello" + value);
            value = value + 1;
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("The value of i is: %d\n", i);
        }

        int loop = 0;
        while(true){
            System.out.println("Looping: " + loop);
            if(loop == 5){
                break;
            }
            loop++;

            System.out.println("Running");
        }

        int value2 = 0;
        do{
            System.out.println("Enter a number: ");
            value = in.nextInt();
        }
        while(value != 5);
        System.out.println("Got 5!");

        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else{
                System.out.println("No more bottles of beer on the wall");
            } //problem is "1 bottles of beer on the wall"
            String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "Front end"};
            String[] wordListTwo = {"empowered", "oriented", "centric", "distributed", "positioned"};
            String[] wordListThree = {"process", "tipping-point", "mission"};

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
            System.out.println("What we need is a " + phrase);
        }



    }
}
