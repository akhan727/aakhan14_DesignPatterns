package main.java.factory;

/**
 * This class is an abstract class that represents the type of Object to be 
 * returned to factory method in the Factory class.
 **/
public abstract class ZombieTruck {
    private String vin;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}