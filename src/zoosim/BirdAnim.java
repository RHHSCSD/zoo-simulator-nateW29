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

    public BirdAnim(int iD, String name, String species, int age, int positionX, int positionY, int size, String speed, double direction, int hunger, int fatigue, String Sound, boolean isFly) {
        super(iD, name, species, age, positionX, positionY, size, speed, direction, hunger, fatigue, Sound);
        this.isFly = isFly;
    }
   
    @Override
    public void fly() {
        System.out.println(getName() + " the " + getSpecies() + " has started flying.");
    }

    @Override
    public void land() {
        System.out.println(getName() + " the " + getSpecies() + " has landed.");
    }

    @Override
    public boolean canFly(){
       return isFly; 
    }
    
}