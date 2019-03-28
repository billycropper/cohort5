package day07;

public class Main {
    public static void main(String[] args) {

        Square shape = new Square(5,6);
        System.out.println(shape.equation());

        Triangle rectangle = new Triangle(5,5,5);
        System.out.println(rectangle.equation());

        //----------------------------------------------

        Spiderman spider = new Spiderman("Spiderman", new String[]{"Web","Punch","Run"});
        System.out.println(spider.printSuperPowers());

        Superman man = new Superman("Superman", new String[]{"Fly","Kryptonite","Laser eyes"});
        System.out.println(man.printSuperPowers());

        //----------------------------------------------

//        Employee person = new Employee("William","Cropper",);
//        CommissionedEmployee person1 = new CommissionedEmployee();
//        BasePlusEmployee person2 = new BasePlusEmployee();
//
//        Object[] hello = new Object[]{person,person1,person2};
//
//        for(int i = 0; i < hello.length; i++){
//            hello[i].paycheck(2000);
//        }

        //-----------------------------------------------

        //difference between overloading and overriding

        //Overloading: Having the same method in a class
        //with different arguments within
        //the parameters OR by changing the data type

        //Overloading is NOT possible by changing the return type of the method only

        //The return type can be the same or different

        //An advantage of overloading is it increases the readability of a program
        //!!Syntax!!

        //Can be applied to multiple methods, not restricted by just two

        //Variable type promotion:
        //https://www.javatpoint.com/method-overloading-in-java#motypepromotion

        ExampleOne one = new ExampleOne();
        System.out.println(one.math(5, 5));
        System.out.println(one.math(5,5,5));

        //Overriding: Method overriding is used to provide the specific implementation of
        //a method which is already provided by its superclass

        //Method must have same name as parent class method, same parameters, and
        //the subclass be inherited from the parent class

        //Method overriding is used to provide the specific implementation of the method that
        //is already provided by its super class

        //We CANNOT override static methods, static methods are bound to the class

        //Overriding MUST have the same return type, unlike overloading
        //Method both can be different in both overloading and overriding

        ExampleTwo two = new ExampleTwo();
        System.out.println(two.math(5,5));
    }
}
