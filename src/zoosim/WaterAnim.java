/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * WaterAnim class represents an aquatic animal in the zoo simulation, which extends the Animal class and implements the ISwimmable interface.
 * It provides functionalities specific to aquatic animals such as swimming.
 * 
 * @author natew
 * @version 1.0
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;
    private boolean canSurface;
    
    
    public WaterAnim(int iD, String name, String species, int age, char sex,  int positionX, int positionY, int size, int speed, double direction, int hunger, int fatigue, String Sound, boolean canBreathe, boolean canSurface) {
        super(iD, name, species, age, sex ,positionX, positionY, size, speed, direction, hunger, fatigue, Sound);
    }
    
    /**
     * Checks if the aquatic animal can breathe underwater.
     * 
     * @return true if the aquatic animal can breathe underwater, otherwise false.
     */
    public boolean canBreathe(){
        return canBreathe;
    }

    /**
     * Checks if the aquatic animal can surface.
     * 
     * @return true if the aquatic animal can surface, otherwise false.
     */
    @Override
    public boolean canSurface() {
        return canSurface;
    }
}
