//program start
import java.util.Scanner;
public class loopArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //number of elements
        final int elements = 8;
        //user numbers
        int[] user_numbers = new  int[elements];
        int i; // loop index

        System.out.println("Enter " + elements + " numbers: ");
        for (i = 0; i < elements; i++) {
            user_numbers[i] = input.nextInt();
            System.out.println("You entered: " + user_numbers[i]);
        }
        System.out.println("You entered: ");
        for (i = 0; i < elements; i++) {
            System.out.println(user_numbers[i]);


        }
        System.out.println();

      
    }
}