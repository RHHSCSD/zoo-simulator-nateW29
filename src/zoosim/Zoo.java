/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;

/**
 *
 * @author natew
 */
public class Zoo {
    ArrayList<Animal> animals;

    public Zoo(LandAnim[] land, WaterAnim[] water, BirdAnim[] bird) {
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void displayStatistics() {
        // Implementation to display zoo statistics
    }

    void feedAllAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    void makeAllAnimalsSleep() {
        for (Animal animal : animals) {
            if (animal.getFatigue() > 0){
                animal.sleep();
            }
            
        }
    }

    void moveAllAnimals() {
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
