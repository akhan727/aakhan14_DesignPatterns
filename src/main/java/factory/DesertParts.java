package main.java.factory;

public class DesertParts extends Factory {
    @Override
    public ZombieTruck createZombieTruck() {
        return new DesertZombieTruck();
    }
}