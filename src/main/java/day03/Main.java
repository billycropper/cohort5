package day03;

public class Main {
    public static void main(String[] args) {

        Employee person = new Employee(5);
        person.calculateEarnings(50.0);

        char ch = 'a';
        String str = "hello";

        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);

        String completedString = builder.toString();
        System.out.println(completedString);

        StringerBuilder builder2 = new StringerBuilder();
        System.out.println(builder2.appender("hello"));

        GradeArray grade = new GradeArray();
        double y = grade.randomNum();
        grade.printGrade(y);
        //System.out.println(y);

        Password enter = new Password();
        enter.enterPassword();

        TwoInputs math = new TwoInputs();
        math.solve();

        Person damon = new Person();
        System.out.println(damon);

        Person david = new Person(24, "David", "Frisbee", "Harvest market", 10);
        david.print();

        Reverse wow = new Reverse();
        wow.back();

        //textbook
        boolean ex = true;
        char ex1 = 'a';
        byte ex2 = 3;
        short ex3 = 45;
        


    }
}
