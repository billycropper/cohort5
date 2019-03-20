package day04;

public class Coyotes extends Canidae {

    private boolean eatsCats;
    public boolean imPublicBro;
    protected boolean imProtectedBlood;

    public Coyotes(String furColor){
        this.furColor = furColor;
        super.hunt();
    }

    public boolean getEatsCats(){
        return this.eatsCats;
    }

    public void setEatsCats(boolean whateverThisIs){
        this.eatsCats = whateverThisIs;
    }

    //extends allows classes to grab other variables, ect from other classes to use
    //super is parent subclass is the child
    //super allows to utilize something from the parent class down to the child class
    //

}
