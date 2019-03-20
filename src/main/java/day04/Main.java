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
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};

        Student student = new Student(firstName, lastName, examScores);
        String output = student.getExamScores();
        System.out.println(output);


    }
}
