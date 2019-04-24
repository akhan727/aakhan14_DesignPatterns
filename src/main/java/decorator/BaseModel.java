package main.java.decorator;

/**
 * This class serves as the concrete component and implements the base class
 * SportsCar.java. Each of the concrete component classes 
 * (PerformanceTires.java, PowerBrakes.java, SuperSuspension.java, 
 * V8Engine.java) will define a type of object that may be wrapped by the 
 * decorators.
 **/
public class BaseModel implements SportsCar {

    public String getDescription() {
        return "\n\t+ $30,000.00 [BASE] Base model";
    }
    
    public double getPrice() {
        return 30000.00;
    }
}
