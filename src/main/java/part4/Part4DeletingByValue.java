package part4;

import utils.NumberUtilities;

import java.util.Arrays;
import java.util.Scanner;
public class Part4DeletingByValue {
    /**
     * Main method to demonstrate deleting a number from an array using different methods.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Create a hard-coded array containing 10 ints
        int[] hardCodedArray = {60, 40, 50 ,40 ,50 ,60 ,50 ,40 ,80 ,90};

        //Print out the array in its original state (including position information)
        NumberUtilities.printArray(hardCodedArray);

        //Ask the user for a number to be deleted
        System.out.println("Which number would you like to be deleted ?");
        int num = sc.nextInt();

        // Ask the user which deleting approach they would like to use
        System.out.println("Which deleting approach you would like to use: \n" +
                "1. Overwrite method. \n" +
                "2. Shift-delete method. \n" +
                "3. Resize method. ");
        int answer = sc.nextInt();
        boolean deleted = false;

        //Delete the number from the array using the approach they have selected
        if(answer == 1){
            NumberUtilities.overwrite(hardCodedArray, NumberUtilities.findPosition(hardCodedArray, num));
            deleted = true;
        } else if (answer == 2){
            deleted = NumberUtilities.shiftDelete(hardCodedArray, num);
        } else if (answer == 3){
            hardCodedArray = NumberUtilities.resizeDelete(hardCodedArray, num);
        } else {
            deleted = false;
        }

        //Print out a message indicating whether it was deleted or not and display the array again
        if(!deleted){
            System.out.println("Changes were made.");
        } else {
            System.out.println("Nothing changed.");
        }
}
}
