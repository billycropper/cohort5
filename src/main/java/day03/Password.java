package day03;

import java.util.Scanner;

public class Password {

    //Scanner in = new Scanner(System.in);
    //String p = in.nextLine();

    public void enterPassword() {

        Scanner us = new Scanner(System.in);
        System.out.println("Please enter username");
        String u = us.nextLine();
        System.out.println("Hello " + u);
        String p;

        int count = 0;
        int attempt = 0;

        do{
            System.out.println("Please enter password");
            p = us.nextLine();
            attempt++;
            count += 1;
        }

        while(!"TGIF".equals(p) && attempt < 4);{

            if(p.equals("TGIF")){
                System.out.println("You logged in successfully, you entered your password " + count + " times.");
            }else{
                System.out.println("Contact the system admin. It took you " + count + " tries.");
            }

            }
        }
    }
