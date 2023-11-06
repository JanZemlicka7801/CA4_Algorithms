package utils;

/**
 *
 * @author jan_zemlicka
 */
public class NumberUtilities {
    /**
     * Deletes a value from a specified position in the array using the overwriting method.
     *
     * @param array    The input array of ints.
     * @param position The position to delete from.
     */
    public static void overwrite( int[] array, int position){
        if (position < 0 || position >= array.length){
            return;
        }
        array[position] = 0;
    }

    /**
     * Deletes the first instance of a specified value using the shifting method.
     * Subsequent instances of that value are kept.
     *
     * @param array The input array of ints.
     * @param num   The value to be deleted.
     * @return True if the value was deleted, false otherwise.
     */

    public static boolean shiftDelete(int[] array, int num){
        int position = -1;

        // Find the position of the number to be deleted
        for (int i = 0; i < array.length; i++){
            if(array[i] == num) {
                position = i;
                break;
            }
        }

        // If the number was not found, return false
            if(position == -1){
                return false;
            }

        // Shift elements to the left to remove the specified value
        for (int r = position; r < array.length - 1; r++){
            array[r] = array[r+1];
        }

        // Set the last element to 0 or any default value
        array[array.length-1] = 0;
        // Number deleted successfully
        return true;
    }

    /**
     * Deletes all instances of a specified value using the resizing method.
     *
     * @param array  The input array of ints.
     * @param single The value to be deleted.
     * @return The new version of the array after deletion.
     */

    public static int[] resizeDelete(int[] array, int single){
        int counter = 0;
        int integerCounter = 0;

        if (array.length < 1 ){
            return array;
        }

        // Count occurrences of the specified number
        for (int i = 0; i < array.length; i++) {
            if (array[i] == single) {
                integerCounter++;
            }
        }

        // Create a new array with size reduced by the number of occurrences of the specified number
        int[] resizeArray = new int[array.length-integerCounter];

        // Copy elements from the original array to the resizeArray, excluding occurrences of the specified number
        for (int i = 0; i < array.length; i++){
            if (array[i] != single){
                resizeArray[counter] = array[i];
                counter++;
            }
        }

        return resizeArray;
    }

    /**
     * Finds the position of the first occurrence of a number in the array.
     *
     * @param array  The input array of ints.
     * @param number The number to be found.
     * @return The index of the first occurrence of the number, or -1 if not found.
     */
    public static int findPosition(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        //Returns -1 if the number is not found
        return -1;
    }

    /**
     * Prints the array elements with their positions.
     *
     * @param array The input array of ints.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + ": " + array[i]);
        }
    }
}
