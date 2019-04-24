package main.java.strategy;

/**
 * This class implements the CarBuilderStrategy interface. This class strategy 
 * is passed to the client or CarBuilderClient class which also has a reference  
 * to the CarBuilderStrategy interface. 
 **/
public class HondaBuilderStrategy implements CarBuilderStrategy {

    /**
     * This method sets the attributes of the HybridCar object.
     * @param make Intakes a string indicating the make of hybrid car object.
     * @return car HybridCar object with set attributes
     **/
    public HybridCar buildCar(String make) {
        
        HybridCar car = new HybridCar();
        
        car.setEngine("1.5L 4-Cylinder Atkinson-Cycle");
        car.setMake(make);
        car.setManufacturer("Honda");
        car.setModel("Insight");
        car.setSeries("3rd-gen");
        car.setSizeClass("Compact Sedan");
        car.setYear("2019");
        
        return car;
    }
}