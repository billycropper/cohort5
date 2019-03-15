package day03;

import java.util.Scanner;

public class Password {

    Scanner in = new Scanner(System.in);
    String p = in.nextLine();

    public String enterPassword() {

        System.out.println("Please enter password");
        Scanner in = new Scanner(System.in);

        int count = 1;
        while(count <= 6){

            String p = in.nextLine();

            if(p == "TGIF"){
                System.out.println("good job");
                System.out.println("You entered your password " + count + " times.");
                break;
            }else if(p != "TGIF") {
                System.out.println("error");
                count--;
            }
            else if(count == -4){
                System.out.println("locked out");
                break;
            }

        }
        return p;
    }
}
