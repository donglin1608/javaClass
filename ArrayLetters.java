/*
 *Donglin Xiong
 *CSC 206 Intermediate Programming
 *Dr.Woerner
 *Purpose: This program is to create a 2D array with random intput letters.
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayLetters{
    public static void main(String[] args){
        //use input value as begining value
        Scanner input = new Scanner(System.in);//create a scanner object

        //Greeting 
        System.out.println("Welcome to letter matrix!");

        //prompt user to enter the number of rows
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();//store the input value to rows
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();

        //create array
        char[][] matrix = createCharArray(rows, columns);//call the method creatCharArray

        //print the array
        System.out.println("Table of Random Characters: ");//print the title
        printCharArray(matrix);//call the method printCharArray

        //calculate character occurrences 
        int[] charCounts = countCharacters(matrix);//call the method countCharacters

        //print end summary 
        System.out.println("\n Table of character Occurrences: ");
        printCharArrayCounts(charCounts);//call the method printCharArrayCounts
    }
    //new section
    //create a method to create 2D array
    public static char[][] createCharArray(int rows, int columns){
        char[][] matrix = new char[rows][columns];//create a 2D array
        Random random = new Random();//create a random object
        //loop through the rows and columns
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                //store the random letters to the array
                matrix[i][j] = (char) ("a" + random.nextInt(26));

            }

        }
        //return the array
        return matrix; 
        
        }
        //create a method to print the array
        public static void printCharArray(char[][] matrix){
            for (char[] matrix1 : matrix){
                for (int j = 0; j < matrix1.length; j++){
                    System.out.print(matrix1[j] + " ");
                }
                System.out.println();
            }
        }
        //create a method to count the characters
        public static int[] countCharacters(char[][] matrix){
            int[] charCounts = new int[26];//create an array with 26 elements
            //loop through the rows and columns
            for (char[] matrix1 : matrix){
                for (int j = 0; j < matrix1.length; j++){
                    //store the characters to the array
                    charCounts[matrix1[j] - 'a']++;
                }
            }
            //return the array
            return charCounts;
        }

        //create a method to print the character occurrences
        public static void printCharArrayCounts(int[] charCounts){
            for (int i = 0; i < charCounts.length; i++){
                //print the characters and their occurrences
                System.out.println((char) ('a' + i) + ": " + charCounts[i]);
            }


    }

}
  