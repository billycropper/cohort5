package day06;

import java.util.ArrayList;

public class Artists {

    //method prints out array of songs

    private ArrayList<String> songs;
    private String name;

    public Artists() {

    }

    public ArrayList<String> artistSongs(){
        songs = new ArrayList<>();
        songs.add(name);
        for(String i : songs){
            System.out.println(i);
        }
        return songs;
    }

    public void setSongs(String name){
        this.name = name;
    }

    public String getSongs(){
        return this.name;
    }

}
