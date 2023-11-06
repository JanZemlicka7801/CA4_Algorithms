/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jan_zemlicka
 */
public class NumberUtilitiesResizeDeleteTest {
    public NumberUtilitiesResizeDeleteTest() {
    }
   
    /**
     * Test of resizeDelete method, of class NumberUtilities where all behaviour is correct.
     */
    @Test
    public void testResizeDeleteWithValidValue() {
        System.out.println("Testing resizeDelete method by trying to delete a value that exists in the array");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int value = 2;
        
        int [] expResult = {1,3,66,12,45,83,45,77};
        int [] newNums = NumberUtilities.resizeDelete(nums, value);
        // Confirm that it returns the right value
        assertArrayEquals(expResult, newNums);
    }
    
    @Test
    public void testResizeDeleteWithValidValueInRun() {
        System.out.println("Testing resizeDelete method by trying to delete a value that exists in the array");
        int [] nums = {1,3,2,2,2,66,12,45,83,2,45,77};
        int value = 2;
        
        int [] expResult = {1,3,66,12,45,83,45,77};
        int [] newNums = NumberUtilities.resizeDelete(nums, value);
        // Confirm that it returns the right value
        assertArrayEquals(expResult, newNums);
    }
    
    /**
     * Test of resizeDelete method, of class NumberUtilities.
     * 
     * Tests that the resizeDelete method will not change an array 
     * when the value to be deleted from doesn't exist
     */
    @Test
    public void testResizeDeleteWithInvalidValue() {
        System.out.println("Testing resizeDelete method by trying to delete a value that doesn't exist in the array");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int value = 18;
        
        int [] expResult = nums;
        int [] newNums = NumberUtilities.resizeDelete(nums, value);
        // Confirm that it returns the right value
        assertArrayEquals(expResult, newNums);
    }
    
    @Test
    public void testResizeDeleteWithEmptyArray() {
        System.out.println("Testing resizeDelete method by trying to delete a value from an empty array");
        int [] nums = {};
        int position = 18;
        
        int [] expResults = nums;
        int [] newNums = NumberUtilities.resizeDelete(nums, position);
        // Confirm that it returns the right value
        assertArrayEquals(expResults, newNums);
    }

}
