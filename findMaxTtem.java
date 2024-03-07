import java.util.Scanner;

public class findMaxTtem {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int numberElement = 10; // number of elements in array
        int[] userNumbers = new int[numberElement]; // user's numbers
        int i; // loop index
        int maxVal; // maximum value

        // prompt user to input numbers
        System.out.println("Enter  " + numberElement + " numbers ");

        for (i = 0; i < numberElement; i++) {
            userNumbers[i] = scnr.nextInt();
            System.out.println("Value: " + userNumbers[i]);
        }
        // find the maximum value
        maxVal = userNumbers[0]; // assume first entry is the largest

        for (i = 0; i < userNumbers.length; i++) {
            if (userNumbers[i] > maxVal) {
                maxVal = userNumbers[i];
            }
        }
        System.out.println("The maximum value is: " + maxVal);

    }
}