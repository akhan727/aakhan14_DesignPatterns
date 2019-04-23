package main.java.strategy;

public class ToyotaBuilderStrategy implements CarBuilderStrategy {

    public HybridCar buildCar(String make) {
        
        HybridCar car = new HybridCar();
        
        car.setEngine("1.8L 4-Cylinder Hybrid");
        car.setMake("Toyota");
        car.setManufacturer("Toyota");
        car.setModel("Prius");
        car.setSeries("4th-gen");
        car.setSizeClass("Compact Sedan");
        car.setYear("2019");
        
        return car;
    }
}
