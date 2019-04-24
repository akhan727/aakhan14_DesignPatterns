package main.java.strategy;

/**
 * This is an interface that implemented by BuilderStrategy classes. This serves
 * as the base class for all classes that provide algorithms or strategies. It
 * includes a single method.
 **/
public interface CarBuilderStrategy {
    
    public HybridCar buildCar(String make);
}