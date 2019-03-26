package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private Double[] examScores;
    private int examsTaken;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public int getNumberOfExamsTaken(){
        return examsTaken;
    }

    public String getExamScores(){
        String scores = "";
        for(int i = 0; i < examScores.length; i++){
            int x = examScores[i].intValue();
            scores = scores + x + " \n";
        }
        return scores;
    }
    public double addExamScore(double examScore){
        String scores = "";
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(examScores));
        arrayList.add(examScore);
        //System.out.println(arrayList);
        //int x = arrayList[0].intValue();
        return examScore;
    }

}
