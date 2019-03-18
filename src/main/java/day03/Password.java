package day03;

import java.util.Scanner;

public class Password {

    //Scanner in = new Scanner(System.in);
    //String p = in.nextLine();

    public void enterPassword() {

        Scanner us = new Scanner(System.in);
        System.out.println("Please enter username");
        String u = us.nextLine();
        System.out.println("Please enter password");

        int count = 1;
        while(count <= 4){

            String p = us.nextLine();

            if(p == "TGIF"){
                System.out.println("You logged in successfully, you entered your password " + count + " times.");
            }else{
                System.out.println("error" + p);
            }count++;
            }
        System.out.println("Contact the system admin. It took you " + count + " tries.");
        }
    }
