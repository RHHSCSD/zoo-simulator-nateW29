/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;
import java.util.List;

/**
 *Animal class
 * @author natew
 * @param: takes in objects using a param
 * @return: uses methods to return a variable
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
    private String[] speedDesc = {"not moving", "slow", "medium", "fast", "very fast"};

    
    public Animal (int iD, String name, String species, int age, char sex, int positionX, int positionY, int size, int speed, double direction, int hunger, int fatigue, String Sound){
        this.iD = iD;
        this.name = name;
        this.species = species;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size=size;
        this.speed = speed;
        this.sex=sex;
        
    }

    public int getiD() {
        return iD;
    }

    public char getSex() {
        return sex;
    }
    
    /**
     * @return: String of speed
     */
    public String getSpeed(){
        if (speed >= 0 && speed <= speedDesc.length){
            return speedDesc[speed];
        }
        else{
           return "Unknown speed"; 
        }
    }

    public int getAge() {
        return age;
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
    
    
    /**
     * @return: returns a sound
     */
    public void makeSound(){
        System.out.println(name + " makes sound: " + sound);
        incFatigue(1);
        incHunger(1);
        checkFatigue();
        checkHunger();
    }
    
    /**
     * Moves the animal and updates fatigue and hunger levels.
     */
    public void move(){
        System.out.println(name + " is " + getSpeed());
        incFatigue(2);
        incHunger(2);
        checkFatigue();
        checkHunger();
    }
    
    /**
     * Simulates the animal eating and restores hunger level.
     */
    public void eat(){
        System.out.println(name + "is eating... Hunger Restored.");
        decHunger();
    }   
    
     /**
     * Simulates the animal sleeping and restores fatigue level.
     */
    public void sleep(){
        System.out.println(name + " is sleeping... Fatigue Restored.");
        decFatigue();
    }
    
     /**
     * Turns the animal and updates fatigue and hunger levels.
     */
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
    
    /**
     * Feeds all hungry animals in the provided array.
     * 
     * @param animals An array of Animal objects.
     */
    public static void feedAll(Animal[] animals){
        for (Animal animal : animals) {
            if (animal != null && animal.getHunger() > 0) {
                animal.eat();
            }
        }
        
    }
    
    /**
     * Sends all fatigued animals to sleep in the provided array.
     * 
     * @param animals An array of Animal objects.
     */
    public static void sleepAll(Animal[] animals){
        for (Animal animal : animals) {
            if (animal != null && animal.getFatigue() > 0) {
                animal.eat();
            }
        }
        
    }
    
    /**
     * Moves all animals in the provided array.
     * 
     * @param animals An array of Animal objects.
     */
    public static void moveAll(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                animal.move();
            }
        }
    }
    
    /**
     * Displays statistics for all animals in the provided array.
     * 
     * @param animals An array of Animal objects.
     */
    public static void displayStat(Animal[] animals) {
        System.out.println("Zoo Statistics:");

        // Display statistics for each animal
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " the " + animal.getSpecies() +
                    " - Age: " + animal.getAge() +
                    ", Hunger: " + animal.getHunger() +
                    ", Fatigue: " + animal.getFatigue() +
                    ", Speed:  " + animal.getSpeed() + ", ID #:  " + animal.getiD() + ", Sex:  " + animal.getSex());
        }
    }

}