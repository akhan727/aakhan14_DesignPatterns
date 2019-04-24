package main.java.decorator;

/**
 * This interface class serves as the component base. It serves as a base class
 * for the concrete component (BaseModel.java) and all decorator classes 
 * (PerformanceTires.java, PowerBrakes.java, SuperSuspension.java, 
 * V8Engine.java). 
 **/
public interface SportsCar {
    
    public String getDescription();
    
    public double getPrice();
}