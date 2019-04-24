package main.java.decorator;

/**
 * This class serves as a concrete decorator. It provides a decorator for 
 * components.
 **/
public class PerformanceTires extends PartsDecorator {
    
    /**
     * A constructor that invokes the constructor of the extended PartsDecorator
     * parent class and prints what upgraded is being added to the base model.
     * @param   newSportsCar New sports car object
     */
    public PerformanceTires(SportsCar newSportsCar) {
        super(newSportsCar);
        System.out.println("Upgraded base model tires from All-Season to Performance...");
    }
    
    public String getDescription() {
        
        return tempSportsCar.getDescription() + "\n\t+    $850.00 [UPGRADE] Performance Tires";
    }
    
    public double getPrice() {
        
        return tempSportsCar.getPrice() + 850.00;
    }
}
