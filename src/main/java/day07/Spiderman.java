package day07;

public class Spiderman extends SuperHero {

    public Spiderman(String name, String[] powers){
        super(name, powers);
    }

    @Override
    public String printSuperPowers(){
       return super.printSuperPowers();
    }

}
