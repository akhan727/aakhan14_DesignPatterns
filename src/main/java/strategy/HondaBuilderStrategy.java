package main.java.strategy;

public class HondaBuilderStrategy implements CarBuilderStrategy {

    public HybridCar buildCar(String make) {
        
        HybridCar car = new HybridCar();
        
        car.setEngine("1.5L 4-Cylinder Atkinson-Cycle");
        car.setMake("Honda");
        car.setManufacturer("Honda");
        car.setModel("Insight");
        car.setSeries("3rd-gen");
        car.setSizeClass("Compact Sedan");
        car.setYear("2019");
        
        return car;
    }
}
