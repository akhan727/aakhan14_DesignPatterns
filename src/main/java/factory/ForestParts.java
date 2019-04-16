package main.java.factory;

public class ForestParts extends Factory {
    @Override
    public ZombieTruck createZombieTruck() {
        return new ForestZombieTruck();
    }
}