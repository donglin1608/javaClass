import java.util.Scanner;
import java.util.Random;


public class ArrayNotes{
    public static void main(String[] agrs){
        //use input value as begining value
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: "); 
        //matrix.length is the number of rows, matrix[0].length is the number of columns

        for (int row = 0; row < matrix.length; row++){//matrix.length is the number of rows
            for (int column = 0; column < matrix[row].length; column++){//matrix[row].length is the number of columns
                matrix[row][column] = input.nextInt();  //input value to the matrix

            }
            }
    //start arrays with random values: 

    for (int row = 0; row < matrix.length; row++){ //matrix.length is the number of rows
        for (int column = 0; column < matrix[row.length; column++){ //matrix[row].length is the number of columns
            matrix[row][column] = (int)(Math.random() * 100); //random value between 0 and 100
        }
        System.out.print(matrix[row][column] + " ")
    }

    System.out.println();
        

    


    
    }



}