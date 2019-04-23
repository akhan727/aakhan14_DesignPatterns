package main.java.strategy;

public class CarBuilderClient {
    
    private CarBuilderStrategy strategy;
    
    public void setStategy(CarBuilderStrategy stategy) {
        
        this.strategy = stategy;
    }
 
    public HybridCar buildCar(String make) {

        return strategy.buildCar(make);
    }
}
