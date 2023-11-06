/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



/**
 *
 * @author jan_zemlicka
 */
public class NumberUtilitiesShiftDeleteTest {
    public NumberUtilitiesShiftDeleteTest() {
    }

    /**
     * Test of shiftDelete method, of class NumberUtilities where all behaviour is correct.
     */
    @Test
    public void testShiftDeleteWithValuePresent() {
        System.out.println("Testing shiftDelete method by trying to delete a value that exists in the array");
        int [] nums = {1,3,3,2,66,12,45,83,2,45,77};
        int value = 2;
        boolean deleted = NumberUtilities.shiftDelete(nums, value);
        // Confirm that it returns the right value
        assertTrue(deleted);
        
        int [] expResult = {1,3,3,66,12,45,83,2,45,77,0};
        // Confirms that the array has been shifted correctly
        assertArrayEquals(expResult, nums);
    }
    
    /**
     * Test of shiftDelete method, of class NumberUtilities.
     * 
     * Tests that the shiftDelete method will not change an array 
     * when the value to be deleted doesn't exist
     */
    @Test
    public void testShiftDeleteWithValueNotPresent() {
        System.out.println("Testing shiftDelete method by trying to delete a value that doesn't exist in the array");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int value = 5;
        boolean deleted = NumberUtilities.shiftDelete(nums, value);
        // Confirm that it returns the right value
        assertFalse(deleted);
        
        int [] expResult = {1,3,2,66,12,45,83,2,45,77};
        // Confirms that the array hasn't been changed
        assertArrayEquals(expResult, nums);
    }
    
    @Test
    public void testShiftDeleteWithEmptyArray() {
        System.out.println("Testing shiftDelete method by trying to delete a value from an empty array");
        int [] nums = {};
        int value = 18;
        boolean deleted = NumberUtilities.shiftDelete(nums, value);
        // Confirm that it returns the right value
        assertFalse(deleted);
        
        int [] expResult = {};
        // Confirms that the array hasn't been changed
        assertArrayEquals(expResult, nums);
    }
}
