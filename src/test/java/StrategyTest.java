package test.java;

import static org.junit.Assert.assertNotNull;

import main.java.strategy.CarBuilderClient;
import main.java.strategy.ChevroletBuilderStrategy;
import main.java.strategy.FordBuilderStrategy;
import main.java.strategy.HondaBuilderStrategy;
import main.java.strategy.HybridCar;
import main.java.strategy.ToyotaBuilderStrategy;

import org.junit.Before;
import org.junit.Test;

public class StrategyTest {

    CarBuilderClient client;
    
    HybridCar toyota;
    HybridCar ford;
    HybridCar chevrolet;
    HybridCar honda;
    
    /**
     * Instantiates a CarBuilderClient object and passes appropriate strategies 
     * to client.
     * @throws RuntimeException when inappropriate use of a null pointer
     */
    @Before
    public void setUp() throws Exception {
        
        client = new CarBuilderClient();
        
        client.setStategy(new ToyotaBuilderStrategy());
        toyota = client.buildCar("Toyota");
        System.out.println(toyota.toString()); // Display to console
        
        client.setStategy(new FordBuilderStrategy());
        ford = client.buildCar("Ford");
        System.out.println(ford.toString()); // Display to console
        
        client.setStategy(new ChevroletBuilderStrategy());
        chevrolet = client.buildCar("Chevrolet");
        System.out.println(chevrolet.toString()); // Display to console
        
        client.setStategy(new HondaBuilderStrategy());
        honda = client.buildCar("Honda");
        System.out.println(honda.toString()); // Display to console
    }

    @Test
    public void test() {
        
        assertNotNull(toyota);
        assertNotNull(ford);
        assertNotNull(chevrolet);
        assertNotNull(honda);
    }
}
