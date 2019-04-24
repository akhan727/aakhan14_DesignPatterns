package main.java.strategy;

/**
 * This class implements the CarBuilderStrategy interface. This class strategy 
 * is passed to the client or CarBuilderClient class which also has a reference  
 * to the CarBuilderStrategy interface. 
 **/
public class FordBuilderStrategy implements CarBuilderStrategy {

    /**
     * This method sets the attributes of the HybridCar object.
     * @param make Intakes a string indicating the make of hybrid car object.
     * @return car HybridCar object with set attributes
     **/
    public HybridCar buildCar(String make) {
        
        HybridCar car = new HybridCar();
        
        car.setEngine("2.0L iVCT Atkinson-Cycle I-4 Hybrid");
        car.setMake("Ford");
        car.setManufacturer("Ford");
        car.setModel("Fusion Hybrid");
        car.setSeries("3rd-gen");
        car.setSizeClass("Mid-Size Sedan");
        car.setYear("2019");
        
        return car;
    }
}
