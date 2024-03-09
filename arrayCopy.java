import java.util.Scanner;

public class arrayCopy {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);         //build object to read the input
        final int numelements = 5;                     //Number of elements in the array
        int [] customerItems = new int[numelements];   //Array of customer items 
        int [] copyitems = new int[numelements];       //Array of copied items
        int i;
        //prompt user to enter the items
        System.out.println("place the items: " + numelements + " items");
        for (i = 0; i < numelements; ++i) {
            System.out.print("item: ");
            customerItems[i] = scnr.nextInt();          //read the items from the user
        }
        //copy the items to the copyitems 
        for (i = 0; i < numelements; ++i){
            copyitems[i] = customerItems[i];
        } 
        //print the copied items
        System.out.println("The copied items are: ");

    }
}
