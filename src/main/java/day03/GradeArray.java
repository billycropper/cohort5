package day03;

public class GradeArray {

    //a b c d f
    //letterGrades name of array

    char[] letterGrades = {'a','b','c','d','f'};

    public void printGrade(double x){
        if(x >= 90.0){
            System.out.println(letterGrades[0]);
        }else if(x >= 80){
            System.out.println(letterGrades[1]);
        }else if(x >= 70){
            System.out.println(letterGrades[2]);
        }else if(x >= 60){
            System.out.println(letterGrades[3]);
        }else if(x <= 59){
            System.out.println(letterGrades[4]);
        }
    }

    public double randomNum(){
        double x = (Math.random() * 100);
        return x;
    }
}
