/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacks
 */
public class ArrayStatsTest {
    
    public ArrayStatsTest() {
    }

   

    /**
     * Test of getTotal method, of class ArrayStats.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int expResult = 210;
        int result = ArrayStats.getTotal(Array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getAverage method, of class ArrayStats.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double expResult = 10.5;
        double result = ArrayStats.getAverage(Array);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getHighest method, of class ArrayStats.
     */
    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int expResult = 20;
        int result = ArrayStats.getHighest(Array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getLowest method, of class ArrayStats.
     */
    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int expResult = 1;
        int result = ArrayStats.getLowest(Array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
