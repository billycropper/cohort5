package day07;

public class Superman extends SuperHero {

    public Superman(String name, String[] powers){
        super(name, powers);
    }

    @Override
    public String printSuperPowers(){
        return super.printSuperPowers();
    }
}
