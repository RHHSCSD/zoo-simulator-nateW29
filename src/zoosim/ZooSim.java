/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

import static zoosim.Animal.displayStat;
import static zoosim.Animal.feedAll;
import static zoosim.Animal.moveAll;
import static zoosim.Animal.sleepAll;


/**
 *
 * @author Nate
 */
public class ZooSim {

    /**
     * 
     * @param: animal objects
     * @return: methods depending on whats called
     */
    public static void main(String[] args) {
        //String[] animalArr = {int iD, String name, String species, int age, int positionX, int positionY, int size, String speed, double direction, int hunger, int fatigue, String Sound};
        LandAnim[] land = new LandAnim[6];
        WaterAnim[] water = new WaterAnim[6];
        BirdAnim[] bird = new BirdAnim[6];
        ZooObjects[] obj = new ZooObjects[5];
        
        land[0] = new LandAnim(340851005, "Leonardo", "Turtoise", 2, 'M', 3, 5, 6, 1, 90.0, 0, 0, "croak");
        land[1] = new LandAnim(030162732, "Mufasa", "Lion", 5, 'M', 5, 9, 5, 3, 180.0, 0, 0, "Roar");
        land[2] = new LandAnim(030162733, "Simba", "Lion", 3,'M',  4, 2, 3, 3, 270.0, 0, 0, "Roar");
        land[3] = new LandAnim(030162734, "Timon", "Meerkat", 2,'M' ,1, 4, 1, 1, 90.0, 0, 0, "Chirp");
        land[4] = new LandAnim(030162736, "Rafiki", "Mandrill", 6,'F', 2, 6, 4, 1, 270.0, 0, 0, "Grunt");
        land[5] = new LandAnim(030162737, "Pumbaa", "Warthog", 7, 'M', 3, 4, 3, 2, 180.0, 0, 0, "Snort");
        
        water[0] = new WaterAnim(030162741, "Flipper", "Dolphin", 8,'F', 2, 4, 3, 3, 90.0, 0, 0, "Clicks", false, true);
        water[1] = new WaterAnim(030162742, "Terry", "Turtle", 4, 'M', 1, 3, 2, 1, 270.0, 0, 0, "Grunt", false, true);
        water[2] = new WaterAnim(030162743, "Ollie", "Octopus", 3, 'F', 3, 2, 1, 2, 180.0, 0, 0, "Hiss", true, false);
        water[3] = new WaterAnim(030162744, "Bruce", "Shark", 6, 'M', 5, 6, 4, 3, 135.0, 0, 0, "Roar", true, false);
        water[4] = new WaterAnim(030162745, "Sammy", "Seal", 5, 'F', 2, 4, 3, 2, 225.0, 0, 0, "Bark", false, true);
        water[5] = new WaterAnim(030162746, "Wally", "Walrus", 7,'M', 4, 5, 5, 1, 315.0, 0, 0, "Roar", false, true);
        

        bird[0] = new BirdAnim(030162747, "Peter", "Peregrine Falcon", 5, 'M',2, 4, 3, 3, 90.0, 0, 0, "Screech", true);
        bird[1]= new BirdAnim(030221454, "Ella", "Eagle", 4, 'F',1, 3, 2, 4, 270.0, 0, 0, "Chirp", true);
        bird[2] = new BirdAnim(030162757, "Ruby", "Robin", 3,'F', 3, 2, 1, 2, 180.0, 0, 0, "Tweet", true);
        bird[3] = new BirdAnim(030162750, "Max", "Flamingo", 6,'M', 5, 6, 4, 1, 135.0, 0, 0, "Quack", false);
        bird[4] = new BirdAnim(030162751, "Oliver", "Penguin", 3,'M', 2, 4, 2, 1, 270.0, 0, 0, "Hoot", false);
        bird[5] = new BirdAnim(030162752, "Sunny", "Dragon", 2, 'F',1, 2, 1, 4, 180.0, 0, 0, "Chirp", true);
        
        obj[0] = new ZooObjects("Tree", 10, 0, 3, 0.0);
        obj[1] = new ZooObjects("Rock", 5, 2, 2, 0.0);
        obj[2] = new ZooObjects("Little kid", 8, 3, 1, 0.0);
        obj[3] = new ZooObjects("Shrub", 3, 1, 2, 0.0);
        obj[4] = new ZooObjects("Zoo Keeper", 7, 6, 4, 182.6);


        displayStat(water);
        
        /**
         * How would you modify this structure to allow for predator/prey interactions and Carnivores/Omnivores/Herbivores?
         * The class structure would need to be changed in order to incorporate predator/prey interactions and classify animals into 
         * Carnivores, Omnivores, and Herbivores based on their diets. Additional variables like dietType might be added to the Animal 
         * superclass in order to categorize animals according to their food choices, yet the Animal superclass would still contain traits 
         * and behaviors that are shared by all animals. The Animal class would be extended with subclasses like Carnivore, Omnivore, 
         * and Herbivore, which would perform actions unique to diets while inheriting common traits and behaviors. A herbivore subclass 
         * may concentrate on grazing and avoiding predators, whereas a carnivore subclass would include hunting activities and interactions 
         * with prey species. The intricacy and realism of the simulated animal behavior and ecological dynamics within the zoo are increased 
         * by this approach. Furthermore, techniques for managing interactions between predators and prey may be implemented within the Zoo class 
         * or within each animal subclass, facilitating dynamic interactions among different animal types within the simulation.
         */
        
    }    
}   