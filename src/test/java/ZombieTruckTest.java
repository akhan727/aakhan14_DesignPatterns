/**
* Tests the Zombie Truck manufactoring program.
*
* @author  Aaron Khan
* @version 1.0
* @since   2019-04-15 
*/

package test.java;

import static org.junit.Assert.assertNotNull;

import main.java.factory.DesertParts;
import main.java.factory.Factory;
import main.java.factory.ForestParts;
import main.java.factory.SwampParts;
import main.java.factory.ZombieTruck;

import org.junit.Before;
import org.junit.Test;

public class ZombieTruckTest {

    Factory testSwampParts;
    Factory testDesertParts;
    Factory testForestParts;
    
    ZombieTruck testSwampZombieTruck;
    ZombieTruck testDesertZombieTruck;
    ZombieTruck testForestZombieTruck;
    
    /**
     * Sets up creation of Zombie Trucks.
     * @throws RuntimeException when inappropriate use of a null pointer
     */
    @Before
    public void setUp() throws Exception {
        testSwampParts = new SwampParts();
        testDesertParts = new DesertParts();
        testForestParts = new ForestParts();
    }

    @Test
    public void test() {
        testSwampZombieTruck = testSwampParts.assembleZombieTruck();
        testDesertZombieTruck = testDesertParts.assembleZombieTruck();
        testForestZombieTruck = testForestParts.assembleZombieTruck();
        
        assertNotNull(testSwampZombieTruck);
        assertNotNull(testDesertZombieTruck);
        assertNotNull(testForestZombieTruck);
    }
}