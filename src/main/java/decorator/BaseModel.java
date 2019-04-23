package main.java.decorator;

public class BaseModel implements SportsCar {

    public String getDescription() {
        return "\n\t+ $30,000.00 [BASE] Base model";
    }
    
    public double getPrice() {
        return 30000.00;
    }
}
