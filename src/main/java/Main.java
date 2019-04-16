package main.java;
import main.java.factory.*;

public class Main {

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