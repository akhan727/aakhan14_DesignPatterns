package main.java.strategy;

public class ChevroletBuilderStrategy implements CarBuilderStrategy {

    public HybridCar buildCar(String make) {
        
        HybridCar car = new HybridCar();
        
        car.setEngine("1.5L 4-Cylinder");
        car.setMake("Chevrolet");
        car.setManufacturer("Chevrolet");
        car.setModel("Volt");
        car.setSeries("2nd-gen");
        car.setSizeClass("Compact Sedan");
        car.setYear("2019");
        
        return car;
    }
}
