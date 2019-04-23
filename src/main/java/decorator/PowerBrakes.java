package main.java.decorator;

public class PowerBrakes extends PartsDecorator {
    
    /**
     * A constructor that invokes the constructor of the extended PartsDecorator
     * parent class and prints what upgraded is being added to the base model.
     * @param   newSportsCar New sports car object
     */
    public PowerBrakes(SportsCar newSportsCar) {
        super(newSportsCar);
        System.out.println("Upgraded base model brakes from Classic to Power...");
    }
    
    public String getDescription() {
        
        return tempSportsCar.getDescription() + "\n\t+  $6,000.00 [UPGRADE] Power Brakes";
    }
    
    public double getPrice() {
        
        return tempSportsCar.getPrice() + 6500.00;
    }
}
