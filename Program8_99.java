import java.util.Random;
import java.util.Scanner;

public class RandomCharacterArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        char[][] charArray = createCharArray(rows, columns);
        printCharArray(charArray);
        int[] charCounts = countCharacters(charArray);
        printCharacterCounts(charCounts);
    }

    public static char[][] createCharArray(int rows, int columns) {
        char[][] array = new char[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        return array;
    }

    public static void printCharArray(char[][] array) {
        System.out.println("Table of Random Characters:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] countCharacters(char[][] array) {
        int[] counts = new int[26]; // Assuming only lower-case letters are generated
        for (char[] row : array) {
            for (char c : row) {
                counts[c - 'a']++;
            }
        }
        return counts;
    }

    public static void printCharacterCounts(int[] counts) {
        System.out.println("Table of Character Occurrences:");
        System.out.print("  ");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int count : counts) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
