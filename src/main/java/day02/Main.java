package day02;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is your number?");

        Zipcode zip = new Zipcode();
        Homework2 home = new Homework2();

        String dayOfTheWeek = "Friday";
        boolean isPayDay = true;

        if(dayOfTheWeek.equals("Friday") && isPayDay == true){
            System.out.println("Where the party at?");
        }else if(dayOfTheWeek.equals("Thursday")){
            System.out.println("F.. more homework from mikaila");
        }else{
            System.out.println("Waka flocka");
        }

        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        int x = 10;
        while(x > 0){
           System.out.println(x);
           x--;
        }
        //just even numbers 10-0
        int y = 10;
        while(y > 0){
            System.out.println(y);
            y-=2;
        }
        int z = 11;
        while(z > 0){
            System.out.println(z);
            z-=2;
        }
        //take number, if divisible by 3 print zip divisible by 5 code, both zipcode
        /*int a = 100;
        if(a%3 == 0 && a%5 == 0){
            System.out.println("zipcode");
        }else if(a%3 == 0){
            System.out.println("zip");
        }else(a%5 == 0){
            System.out.println("code");
        }*/

        zip.zipNum();
        home.Zipcode2(50);
    }
}
