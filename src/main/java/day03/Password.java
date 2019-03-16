package day03;

import java.util.Scanner;

public class Password {

    Scanner in = new Scanner(System.in);
    String p = in.nextLine();

    public String enterPassword() {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter username");
        String u = in.nextLine();
        System.out.println("Please enter password");

        int count = 1;
        while(count <= 4){

            p = in.nextLine();

            if(p == "TGIF"){
                System.out.println("You logged in successfully");
                System.out.println("You entered your password " + count + " times.");
            }else{
                System.out.println("error");
            }count++;
            }
        System.out.println("Contact the system admin. It took you " + count + " tries.");
        return p;
        }
    }
