package main.java.factory;

public class SwampParts extends Factory {
    @Override
    public ZombieTruck createZombieTruck() {
        return new SwampZombieTruck();
    }
}