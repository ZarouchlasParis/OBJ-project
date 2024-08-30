package Assignment_001;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    protected String name;
    protected int age;
    protected String profession;
    protected String city;
    protected Scanner scan;

/*
Function that identifies the user's name
 */
    public String getUsers_name(){
        if(name == null){
            System.out.println("Give your name to continue");
            return null;
        }else {
            Users getUser = new Users();
            Scanner scan = new Scanner(System.in);
            return this.name;
        }

    }
    /*
        For my quiz, kids that are 5 years old or less cannot participate in the quiz
     */
    public int getAge(){
        if (age == 0 || age <= 5) {
            System.out.println("Invalid age");
            return age;
        } else {
            Users getAges = new Users();
        }
        return this.age;
    }
    /*
        It is helpful if the system were to know the person's profession before starting the game
     */
    public String getProfession(){
        if (profession == "Unemployed" || profession == null) {
            return null;
        } else {
            return this.profession;
        }

    }
    /*
        The quiz game system wants to know the location of each participant
     */
    public String getCity(){
        return this.city;
    }

}
