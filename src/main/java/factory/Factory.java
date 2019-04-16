package main.java.factory;

public abstract class Factory {
    ZombieTruck zombieTruck;
    public ZombieTruck assembleZombieTruck() {
        System.out.println("Step 1: Starting to build Zombie Truck...");
        zombieTruck = createZombieTruck();
        System.out.println("Step 3: Adding terrain-specific parts to Zombie Truck frame...");
        System.out.println("/////// Zombie Truck completed!\n");
        return zombieTruck;
    }
    protected abstract ZombieTruck createZombieTruck();
}
