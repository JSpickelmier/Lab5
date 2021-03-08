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
public class ArrayHigherNumbersTest {
    
    public ArrayHigherNumbersTest() {
    }

    
    /**
     * Test of ArrayCount method, of class ArrayHigherNumbers.
     */
    @Test
    public void testArrayCount() {
        System.out.println("ArrayCount");
        int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int inputNumb = 10;
        int expResult = 5;
        int result = ArrayHigherNumbers.ArrayCount(Array, inputNumb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
