/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * ZooObjects class represents various objects within the zoo simulation.
 * It implements the IObject interface.
 * 
 * @author natew
 * @version 1.0
 */
public class ZooObjects implements IObject{
    private String type;
    private int positionX;
    private int positionY;
    private int size;
    private double turn;
    private String[] sizeVar = {"tiny", "small", "big", "large"};
    
    public ZooObjects(String type, int positionX, int positionY, int size, double turn){
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
        this.turn = turn;
        
    }
    
    
    /**
     * Retrieves the size description of the object.
     * 
     * @return String representation of the object's size.
     */
    public String getSize(){
        if (size >= 0 && size <= sizeVar.length){
            return sizeVar[size];
        }
        else{
           return "Unknown speed"; 
        }
    }
    
    /**
     * Turns the object.
     */

    @Override
    public void turn() {
        System.out.println("A " + type + " has turned " + turn + "degrees");
    }

    /**
     * Places the object.
     */
    @Override
    public void place() {
        System.out.println("A " + getSize() + " " + type + " is at the coordinates (" + positionX + "," + positionY + ")");
    }
    
}
 