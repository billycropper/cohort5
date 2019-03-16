package day03;

public class Person {

    public int age;
    public String name;
    public String favoritesport;
    public String job;
    public int salary;

    public Person() {

    }

    public Person(int age, String name, String favoritesport, String job, int salary) {
        this.age = age;
        this.name = name;
        this.favoritesport = favoritesport;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favoritesport='" + favoritesport + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String print(){

        System.out.println("My name is " + name + " and I am " + age + " years old. My Favorite sports is " + favoritesport + " and by this time next year my occupation will be " + job + " meaning I could be making up to " + salary + " yearly!");

    }
}
