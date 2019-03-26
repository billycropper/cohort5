package day04;

public class Main {
    public static void main(String[] args) {
        /*Coyotes wiley = new Coyotes("Brown");
        System.out.println(wiley.getEatsCats());
        boolean storeEatsCats = wiley.getEatsCats();
        wiley.setEatsCats(false);
        System.out.println(storeEatsCats);
        wiley.setEatsCats(true);
        storeEatsCats = wiley.getEatsCats();
        System.out.println(storeEatsCats);*/

        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };

        Student student = new Student(firstName, lastName, examScores);
        /*String output = student.getExamScores();
        System.out.println(output);*/

        student.addExamScore(100.0);
        String output = student.getExamScores();
        System.out.println(output);

        Discount calc = new Discount();
        calc.calculateDiscount(2000.0, 27.3);

        //do{
        //    int i = 0;
        //    System.out.println(i);
        //    i+=2;
        //}


    }
}
