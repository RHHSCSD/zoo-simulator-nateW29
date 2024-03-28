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
    public boolean canBreathe(){
        return false;
    }

    @Override
    public void canSurface() {
    }
}
