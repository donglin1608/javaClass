import java.util.Scanner;

public class CustomerInfo {
   /**
 * @param args
 */
public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		final int NUM_VALS = 5;
      int i;

      /* Your code goes here */
     final int[] customerNumbers = new int[NUM_VALS];

      System.out.print("Customer numbers: ");
      for (i = 0; i < customerNumbers.length; ++i) {
         System.out.print(customerNumbers[i] + " ");
      }
      System.out.println();
   }
}

