/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jan_zemlicka
 */
public class NumberUtilitiesOverwriteTest {
    public NumberUtilitiesOverwriteTest() {
    }
    
    /**
     * Test of overwrite method, of class NumberUtilities.
     */
    @Test
    public void testOverwriteWithValidPosition() {
        System.out.println("Testing overwrite method by trying to delete from a valid position");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int position = 0;
        NumberUtilities.overwrite(nums, position);
        assertEquals(nums[0], 0);
    }
    
    @Test
    public void testOverwriteWithInvalidGreaterPosition() {
        System.out.println("Testing overwrite method by trying to delete from an invalid position beyond the length of the array");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int position = 17;
        
        int [ ] expResult = {1,3,2,66,12,45,83,2,45,77};
        NumberUtilities.overwrite(nums, position);
        assertArrayEquals(expResult, nums);
    }
    
    @Test
    public void testOverwriteWithInvalidLesserPosition() {
        System.out.println("Testing overwrite method by trying to delete from an invalid position before the start of the array");
        int [] nums = {1,3,2,66,12,45,83,2,45,77};
        int position = -17;
        
        int [ ] expResult = {1,3,2,66,12,45,83,2,45,77};
        NumberUtilities.overwrite(nums, position);
        assertArrayEquals(expResult, nums);
    }
    
    @Test
    public void testOverwriteWithEmptyArray(){
        System.out.println("Testing overwrite method by trying to delete from an empty array");
        int [] nums = {};
        int position = 5;
        
        int [] expResult = {};
        NumberUtilities.overwrite(nums, position);
        assertArrayEquals(expResult, nums);
    }
}
