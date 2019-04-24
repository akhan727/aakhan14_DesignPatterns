package main.java.decorator;

/**
 * This abstract class serves as the decorator base and is the base for all 
 * decorators for components. This class inheirits its public interface from 
 * SportsCar.java so that the decorators can be used in place of concrete
 * objects.
 **/
public abstract class PartsDecorator implements SportsCar {
    
    protected SportsCar tempSportsCar;
    
    /**
     * A constructor that accepts SportsCar objects as its parameter. This 
     * object is the component that will be wrapped. This is so multiple
     * decorators can be applied to a single object.
     * @param newSportsCar
     **/
    public PartsDecorator(SportsCar newSportsCar) {
        tempSportsCar = newSportsCar;
    }
    
    public String getDescription() {
        return tempSportsCar.getDescription();
    }
    
    public double getPrice() {
        return tempSportsCar.getPrice();
    }
}
