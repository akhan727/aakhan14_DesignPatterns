package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DecimalFormat;

import main.java.decorator.BaseModel;
//import main.java.decorator.PartsDecorator; // Never used
import main.java.decorator.PerformanceTires;
import main.java.decorator.PowerBrakes;
import main.java.decorator.SportsCar;
import main.java.decorator.SuperSuspension;
import main.java.decorator.V8Engine;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
    
    DecimalFormat formatter = new DecimalFormat("#,###.00");
    
    SportsCar baseModel;
    SportsCar oneUpgrade;
    SportsCar twoUpgrades;
    SportsCar threeUpgrades;
    SportsCar fourUpgrades;
    
    /**
     * Sets up multiple objects with just the base model or a various number of 
     * upgrades.
     * @throws RuntimeException when inappropriate use of a null pointer
     */
    @Before
    public void setUp() throws Exception {
        
        baseModel = new BaseModel();
        
        oneUpgrade = new SuperSuspension(
                     new BaseModel());
        
        twoUpgrades = new SuperSuspension(
                      new PowerBrakes(
                      new BaseModel()));
        
        threeUpgrades = new SuperSuspension(
                        new PowerBrakes(
                        new PerformanceTires(
                        new BaseModel())));
        
        fourUpgrades = new SuperSuspension(
                       new PowerBrakes(
                       new PerformanceTires(
                       new V8Engine(
                       new BaseModel()))));
    }

    @Test
    public void test() {
        
        assertNotNull(baseModel);
        assertNotNull(oneUpgrade);
        assertNotNull(twoUpgrades);
        assertNotNull(threeUpgrades);
        assertNotNull(fourUpgrades);
        
        //System.out.println(formatter.format(baseModel.getPrice()));
        //System.out.println(formatter.format(30000.00));
        
        assertEquals(formatter.format(30000.00), formatter.format(baseModel.getPrice()));
        assertEquals(formatter.format(33225.00), formatter.format(oneUpgrade.getPrice()));
        assertEquals(formatter.format(39725.00), formatter.format(twoUpgrades.getPrice()));
        assertEquals(formatter.format(40575.00), formatter.format(threeUpgrades.getPrice()));
        assertEquals(formatter.format(50575.00), formatter.format(fourUpgrades.getPrice()));  
        
        System.out.println("\nInvoice: " + baseModel.getDescription());
        System.out.println("\n\t  $" + formatter.format(baseModel.getPrice()) 
                           + " [TOTAL]"); 
        
        System.out.println("\nInvoice: " + oneUpgrade.getDescription());
        System.out.println("\n\t  $" + formatter.format(oneUpgrade.getPrice()) 
                           + " [TOTAL]"); 
        
        System.out.println("\nInvoice: " + twoUpgrades.getDescription());
        System.out.println("\n\t  $" + formatter.format(twoUpgrades.getPrice()) 
                           + " [TOTAL]"); 
        
        System.out.println("\nInvoice: " + threeUpgrades.getDescription());
        System.out.println("\n\t  $" + formatter.format(threeUpgrades.getPrice()) 
                           + " [TOTAL]"); 
        
        System.out.println("\nInvoice: " + fourUpgrades.getDescription());
        System.out.println("\n\t  $" + formatter.format(fourUpgrades.getPrice()) 
                           + " [TOTAL]"); 
    }
}