package main.java.decorator;

public class V8Engine extends PartsDecorator {
    
    /**
     * A constructor that invokes the constructor of the extended PartsDecorator
     * parent class and prints what upgraded is being added to the base model.
     * @param   newSportsCar New sports car object
     */
    public V8Engine(SportsCar newSportsCar) {
        
        super(newSportsCar);        
        System.out.println("Upgraded base model engine from V4 to V8...");
    }
    
    public String getDescription() {
        
        return tempSportsCar.getDescription() + "\n\t+ $10,000.00 [UPGRADE] V8 Engine";
    }
    
    public double getPrice() {
        
        return tempSportsCar.getPrice() + 10000.00;
    }
}
