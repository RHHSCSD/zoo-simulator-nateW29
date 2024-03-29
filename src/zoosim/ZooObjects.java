/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author natew
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
    
    public String getSize(){
        if (size >= 0 && size <= sizeVar.length){
            return sizeVar[size];
        }
        else{
           return "Unknown speed"; 
        }
    }
    
    @Override
    public void turn() {
        System.out.println("A " + type + " has turned " + turn + "degrees");
    }

    @Override
    public void place() {
        System.out.println("A " + getSize() + " " + type + " is at the coordinates (" + positionX + "," + positionY + ")");
    }
    
}
