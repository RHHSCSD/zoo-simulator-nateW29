/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author natew
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean isFly;

    public BirdAnim(int iD, String name, String species, int age, char sex, int positionX, int positionY, int size, int speed, double direction, int hunger, int fatigue, String Sound, boolean isFly) {
        super(iD, name, species, age, sex, positionX, positionY, size, speed, direction, hunger, fatigue, Sound);
        this.isFly = isFly;
    }
   
    /**
     * Makes the bird fly.
     */

    @Override
    public void fly() {
        System.out.println(getName() + " the " + getSpecies() + " has started flying.");
    }

    /**
     * Makes the bird land.
     */
    @Override
    public void land() {
        System.out.println(getName() + " the " + getSpecies() + " has landed.");
    }

    /**
     * Checks if the bird can fly.
     * 
     * @return true if the bird can fly, otherwise false.
     */
    @Override
    public boolean canFly(){
       return isFly; 
    }
    
}