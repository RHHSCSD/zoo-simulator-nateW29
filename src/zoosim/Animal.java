/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natew
 */
public class Animal implements IEntity{
    private int iD;
    private String name;
    private String species;
    private int age;
    private char sex;
    private int positionX;
    private int positionY;
    private int size;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    public Animal (int iD, String name, String species, int age, int positionX, int positionY, int size, String speed, double direction, int hunger, int fatigue, String Sound){
        this.iD = iD;
        this.name = name;
        this.species = species;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size=size;
        
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }
    
    
    
    public void makeSound(){
        System.out.println(name + " makes sound: " + sound);
        incFatigue(1);
        incHunger(1);
        checkFatigue();
        checkHunger();
    }
    
    public void move(){
        System.out.println(name + " is moving " + speed);
        incFatigue(2);
        incHunger(2);
        checkFatigue();
        checkHunger();
    }
    
    public void eat(){
        System.out.println(name + "is eating... Hunger Restored.");
        decHunger();
    }   
    
    public void sleep(){
        System.out.println(name + " is sleeping... Fatigue Restored.");
        decFatigue();
    }
    
    public void turn(){
        System.out.println(name + " turned " + direction + "degrees");
        incFatigue(1);
        incHunger(1);
        checkFatigue();
        checkHunger();
    }
    
    public void place(){
    }
    public void incFatigue(int amount) {
        // Increment fatigue level
        fatigue += amount;
    }
    public void incHunger(int amount) {
        // Increment hunger level
        hunger += amount;
    }
    
    public void decFatigue(){
        fatigue = 0;
    }
    public void decHunger(){
        fatigue = 0;
    }
    
    private void checkFatigue(){
        if (fatigue >= 10){
            System.out.println(name + " the " + species + " is getting tired.");
        }
    }
    private void checkHunger(){
        if (hunger >= 5){
            System.out.println(name + " the " + species + " is getting hungry.");
        }
    }
}
