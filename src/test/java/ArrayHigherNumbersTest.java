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
        int[] Array = null;
        int inputNumb = 10;
        int expResult = 5;
        int result = ArrayHigherNumbers.ArrayCount(Array, inputNumb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
