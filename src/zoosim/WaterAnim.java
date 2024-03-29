/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author natew
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;
    private boolean canSurface;
    
    
    public WaterAnim(int iD, String name, String species, int age, char sex,  int positionX, int positionY, int size, int speed, double direction, int hunger, int fatigue, String Sound, boolean canBreathe, boolean canSurface) {
        super(iD, name, species, age, sex ,positionX, positionY, size, speed, direction, hunger, fatigue, Sound);
    }
    
    public boolean canBreathe(){
        return canBreathe;
    }

    @Override
    public boolean canSurface() {
        return canSurface;
    }
}
