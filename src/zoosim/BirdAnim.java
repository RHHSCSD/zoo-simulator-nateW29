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

    public BirdAnim(int iD, String name, String species, int age, int positionX, int positionY, int size, String speed, double direction, int hunger, int fatigue, String Sound) {
        super(iD, name, species, age, positionX, positionY, size, speed, direction, hunger, fatigue, Sound);
    }
    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }

    @Override
    public boolean isFlying() {
    }
    
    }
}
