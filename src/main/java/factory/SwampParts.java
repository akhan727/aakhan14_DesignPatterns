package main.java.factory;

/**
 * This class extends the Factory class. It is used to override the 
 * createZombieTruck() method to return specific objects.
 **/
public class SwampParts extends Factory {
    @Override
    public ZombieTruck createZombieTruck() {
        return new SwampZombieTruck();
    }
}