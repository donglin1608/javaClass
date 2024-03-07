import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        int[] userVals = new int[NUMB_ELEMENTS];
        int i;
        int SumVal;
        int avgVal;

        //user to populate the array
        System.out.println("Enter " + NUMB_ELEMENTS + "integer values");

        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println("Value " + i + " is: " + userVals[i]);
        }

        //Determine the Sum and average of the array
        sumVal = 0;
        avgVal = 0;
        for (i = 0; i < userVals.length; ++i) {
            sumVal = sumVal + userVals[i];
            avgVal = sumVal / NUM_ELEMENTS;
        }

    })
   


}