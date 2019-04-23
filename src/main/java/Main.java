/**
* This program processes vehicles using 3 different design patterns.
*
* @author  Aaron Khan
* @version 2.0
* @since   2019-04-22 
*/

package main.java;

import java.text.DecimalFormat;

import main.java.decorator.BaseModel;
import main.java.decorator.PartsDecorator;
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
import main.java.strategy.CarBuilderStrategy;
import main.java.strategy.ChevroletBuilderStrategy;
import main.java.strategy.FordBuilderStrategy;
import main.java.strategy.HondaBuilderStrategy;
import main.java.strategy.HybridCar;
import main.java.strategy.ToyotaBuilderStrategy;

public class Main {

    /**
     * This is the main method. You could see this as the dealership
     * @param args Used for command line arguments.
     **/
    public static void main(String[] args) {
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*               FACTORY PATTERN               *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
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
        
        System.out.println("\n\n" 
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*              DECORATOR PATTERN              *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        System.out.println("Ordering sports car...\n");
        
        SportsCar mySportsCar = new SuperSuspension(
                                new PowerBrakes(
                                new PerformanceTires(
                                new V8Engine(
                                new BaseModel()))));
        
        System.out.println("\nInvoice: " + mySportsCar.getDescription());
        System.out.println("\n\t  $" + formatter.format(mySportsCar.getPrice()) 
                           + " [TOTAL]");     
        
        System.out.println("\n\n" 
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n"
                         + "*                                             *\n"
                         + "*              STRATEGY PATTERN               *\n"
                         + "*                                             *\n"
                         + "* * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        CarBuilderClient client = new CarBuilderClient();
        
        client.setStategy(new ToyotaBuilderStrategy());
        HybridCar toyota = client.buildCar("Toyota");
        System.out.println(toyota.toString());
        
        client.setStategy(new FordBuilderStrategy());
        HybridCar ford = client.buildCar("Ford");
        System.out.println(ford.toString());
        
        client.setStategy(new ChevroletBuilderStrategy());
        HybridCar chevrolet = client.buildCar("Chevrolet");
        System.out.println(chevrolet.toString());
        
        client.setStategy(new HondaBuilderStrategy());
        HybridCar honda = client.buildCar("Honda");
        System.out.println(honda.toString());
    }
}