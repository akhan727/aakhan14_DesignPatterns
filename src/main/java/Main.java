/**
* This program processes vehicles using 3 different design patterns. This Main
* class can be seen as the dealership that orders cars from various factories.
*
* @author  Aaron Khan
* @version 2.0
* @since   2019-04-22 
*/

package main.java;

import java.text.DecimalFormat;

import main.java.decorator.BaseModel;
//import main.java.decorator.PartsDecorator; // Never used
import main.java.decorator.PerformanceTires;
import main.java.decorator.PowerBrakes;
import main.java.decorator.SportsCar;
import main.java.decorator.SuperSuspension;
import main.java.decorator.V8Engine;

import main.java.factory.DesertParts;
import main.java.factory.DesertZombieTruck;
import main.java.factory.Factory;
import main.java.factory.ForestParts;
import main.java.factory.ForestZombieTruck;
import main.java.factory.SwampParts;
import main.java.factory.SwampZombieTruck;
import main.java.factory.ZombieTruck;

import main.java.strategy.CarBuilderClient;
//import main.java.strategy.CarBuilderStrategy; // Never used
import main.java.strategy.ChevroletBuilderStrategy;
import main.java.strategy.FordBuilderStrategy;
import main.java.strategy.HondaBuilderStrategy;
import main.java.strategy.HybridCar;
import main.java.strategy.ToyotaBuilderStrategy;

public class Main {

    /**
     * This is the main method. You could see this as the dealership
     * @param args Used for command line arguments. Non-functional.
     **/
    public static void main(String[] args) {
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*               FACTORY PATTERN               *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        // Instantiates SwampParts, DesertParts, and ForestParts. FYI, although 
        // I labeled them as "Parts" they are actually "Factories". These 
        // factory classes extends Factory.java.  
        Factory swampParts = new SwampParts();
        Factory desertParts = new DesertParts();
        Factory forestParts = new ForestParts();

        // The assembleVehicle() method from Factory.java is invoked which in 
        // turn invokes the createZombieTruck() method.
        ZombieTruck swampZombieTruck = swampParts.assembleZombieTruck();
        ZombieTruck desertZombieTruck = desertParts.assembleZombieTruck();
        ZombieTruck forestZombieTruck = forestParts.assembleZombieTruck();

        // At runtime, actual factory method implementation will be invoked
        // because of polymorphism.
        if (swampZombieTruck instanceof SwampZombieTruck) {
            System.out.println("Swamp Zombie Truck delivered from factory.");
        }

        if (desertZombieTruck instanceof DesertZombieTruck) {
            System.out.println("Desert Zombie Truck delivered from factory.");
        }

        if (forestZombieTruck instanceof ForestZombieTruck) {
            System.out.println("Foreset Zombie Truck delivered from factory.");
        }
        
        System.out.println("\n\n" 
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*              DECORATOR PATTERN              *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        // Sets the format for displaying the appropriate dollar amounts
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        System.out.println("Ordering sports car...\n");
        
        // Creates a SportsCar object along with the added upgrades to the Base
        // model (concrete component).
        SportsCar mySportsCar = new SuperSuspension(
                                new PowerBrakes(
                                new PerformanceTires(
                                new V8Engine(
                                new BaseModel()))));
        
        // Displays an invoice showing the added upgrades and total
        System.out.println("\nInvoice: " + mySportsCar.getDescription());
        System.out.println("\n\t  $" + formatter.format(mySportsCar.getPrice()) 
                           + " [TOTAL]");     
        
        System.out.println("\n\n" 
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*              STRATEGY PATTERN               *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        // Instantiates a CarBuilderClient object
        CarBuilderClient client = new CarBuilderClient();
        
        // Passing appropriate strategies to client
        client.setStategy(new ToyotaBuilderStrategy());
        HybridCar toyota = client.buildCar("Toyota");
        System.out.println(toyota.toString()); // Display to console
        
        client.setStategy(new FordBuilderStrategy());
        HybridCar ford = client.buildCar("Ford");
        System.out.println(ford.toString()); // Display to console
        
        client.setStategy(new ChevroletBuilderStrategy());
        HybridCar chevrolet = client.buildCar("Chevrolet");
        System.out.println(chevrolet.toString()); // Display to console
        
        client.setStategy(new HondaBuilderStrategy());
        HybridCar honda = client.buildCar("Honda");
        System.out.println(honda.toString()); // Display to console
    }
}