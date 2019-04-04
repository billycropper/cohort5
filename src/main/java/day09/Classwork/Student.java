package day09.Classwork;

public class Student {

    private String name;
    private int Age;

    public Student(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
