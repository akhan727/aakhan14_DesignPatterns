package main.java.decorator;

/**
 * This class serves as a concrete decorator. It provides a decorator for 
 * components.
 **/
public class SuperSuspension extends PartsDecorator {
    
    /**
     * A constructor that invokes the constructor of the extended PartsDecorator
     * parent class and prints what upgraded is being added to the base model.
     * @param   newSportsCar New sports car object
     */
    public SuperSuspension(SportsCar newSportsCar) {
        super(newSportsCar);
        System.out.println("Upgraded base model suspension from Basic to Super...");
    }
    
    public String getDescription() {
        
        return tempSportsCar.getDescription() + "\n\t+  $3,225.00 [UPGRADE] Super Suspension";
    }
    
    public double getPrice() {
        
        return tempSportsCar.getPrice() + 3225.00;
    }
}
