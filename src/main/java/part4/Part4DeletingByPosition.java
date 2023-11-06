package part4;

import utils.NumberUtilities;

import java.util.Scanner;

import static utils.FileHandlingUtilities.readNumericFile;

/**
 *
 * @author jan_zemlicka
 */
public class Part4DeletingByPosition {
    /**
     * Reads numbers from a file, creates an array, and allows
     * the user to specify a position to delete a number from the array. The program prints the array
     * before and after method.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        //Input scanner to read from the user
        Scanner sc = new Scanner(System.in);

        //Take in numbers from a file and create an array based on these numbers.
        int[] nums = readNumericFile("SampleInput/Week5SampleInput1.txt");

        //Prints out the array in its original state
        System.out.println("Array in original state :");
        NumberUtilities.printArray(nums);

        //Ask the user what position they would like to delete from
        System.out.println("What position you would like to delete from.");
        int position = sc.nextInt();

        //Delete the number from the specified position
        NumberUtilities.overwrite(nums, position);

        // Print out the array in its updated state
        System.out.println("Array in updated state :");
        NumberUtilities.printArray(nums);
    }
}
