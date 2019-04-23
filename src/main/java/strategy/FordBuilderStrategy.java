package main.java.strategy;

public class FordBuilderStrategy implements CarBuilderStrategy {

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
