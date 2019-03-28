package day07;

import java.util.Arrays;

public class SuperHero {

    protected String name;
    private String[] powers;

    public void setPowers(String[] powers){
        this.powers = powers;
    }

    public String[] getPowers(){
        return powers;
    }

    public SuperHero(String name, String[] powers){
        this.powers = powers;
        this.name = name;
    }

    public String printSuperPowers(){
        String str = "";
        for(int i = 0; i < powers.length; i++){
            str += powers[i] + " ";
        }
        return name + " super powers are " + str;
    }
}
