package main.java.decorator;

public abstract class PartsDecorator implements SportsCar {
    
    protected SportsCar tempSportsCar;
    
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
