package day04;

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

}
