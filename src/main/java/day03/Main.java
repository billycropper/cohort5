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
    }
}
