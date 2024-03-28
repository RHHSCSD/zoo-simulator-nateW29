/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

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
    public void makeSound(){
        System.out.println(name + " makes sound: " + sound);
    }
    
    public void move(){
        System.out.println(name + " is moving " + speed);
    }
    
    public void eat(){
        System.out.println(name + "is eating... Hunger Restored.");
    }   
    
    public void sleep(){
        System.out.println(name + "is sleeping... Fatigue Restored.");
    }
    
    public void turn(){
        System.out.println(name + " turned " + direction + "degrees");
    }
    
    public void place(){
    }
}
