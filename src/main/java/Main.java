/**
* This program creates three different styles of Zombie Trucks that are used for
* specific terrains.
*
* @author  Aaron Khan
* @version 1.0
* @since   2019-04-15 
*/

package main.java;

import main.java.factory.DesertParts;
import main.java.factory.DesertZombieTruck;
import main.java.factory.Factory;
import main.java.factory.ForestParts;
import main.java.factory.ForestZombieTruck;
import main.java.factory.SwampParts;
import main.java.factory.SwampZombieTruck;
import main.java.factory.ZombieTruck;

public class Main {

    /**
     * This is the main method. You could see this as the dealership
     * @param args Used for command line arguments.
     **/
    public static void main(String[] args) {
        
        System.out.println("/////// FACTORY PATTERN ///////\n");
        
        Factory swampParts = new SwampParts();
        Factory desertParts = new DesertParts();
        Factory forestParts = new ForestParts();

        ZombieTruck swampZombieTruck = swampParts.assembleZombieTruck();
        ZombieTruck desertZombieTruck = desertParts.assembleZombieTruck();
        ZombieTruck forestZombieTruck = forestParts.assembleZombieTruck();

        if (swampZombieTruck instanceof SwampZombieTruck) {
            System.out.println("Swamp Zombie Truck delivered from factory.");
        }

        if (desertZombieTruck instanceof DesertZombieTruck) {
            System.out.println("Desert Zombie Truck delivered from factory.");
        }

        if (forestZombieTruck instanceof ForestZombieTruck) {
            System.out.println("Foreset Zombie Truck delivered from factory.");
        }
    }
}