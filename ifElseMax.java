import java.util.Scanner;

public class ifElseMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x;
        int y;
        //Taking input from user
        x = input.nextInt();
        y = input.nextInt();

        //Decision making with condition statement
        if (x > y){
            System.out.println(" X is greater than y.");
        }else{
            System.out.println("Y is greaten than x.")
        }



    }    
}
