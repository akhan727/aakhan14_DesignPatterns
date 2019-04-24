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
        
        client.setStategy(new FordBuilderStrategy());
        ford = client.buildCar("Ford");
        
        client.setStategy(new ChevroletBuilderStrategy());
        chevrolet = client.buildCar("Chevrolet");
        
        client.setStategy(new HondaBuilderStrategy());
        honda = client.buildCar("Honda");
    }

    @Test
    public void test() {
        
        assertNotNull(toyota);
        assertNotNull(ford);
        assertNotNull(chevrolet);
        assertNotNull(honda);
    }
}
