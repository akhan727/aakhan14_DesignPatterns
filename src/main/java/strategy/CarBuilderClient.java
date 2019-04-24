package main.java.strategy;

/**
 * This client class has a reference to the CarBuilderStrategy interface. It is
 * a user of an interchangeable algorithm. This class can hold one of the
 * strategy classes and will be set at run-time depending on the algorithm that
 * is required.
 **/
public class CarBuilderClient {
    
    private CarBuilderStrategy strategy;
    
    public void setStategy(CarBuilderStrategy stategy) {
        
        this.strategy = stategy;
    }
 
    public HybridCar buildCar(String make) {

        return strategy.buildCar(make);
    }
}