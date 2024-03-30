public class CheckSudokuSolution {
    public static boolean isValidSudoku(int[][] board) {
        // TODO: Implement the logic to check if the given Sudoku solution is valid
        //read a sudoku solution
        int[] [] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");


    }
    
    //read a sudoku solution from the console
   public static int[][] readASolution(){
       //create a Scanner
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a Sudoku puzzle solution: ");
       int[][] grid = new int[9][9];
       for (int i = 0; i < 9; i++)
           for (int j = 0; j < 9; j++)
               grid[i][j] = input.nextInt();
       return grid;
    }
    //check wether grid [i][j]is valid in the grid                 to do List: following the instructions in the comments, implement the hasDuplicate method
    public static boolean isValid(int i, int j, [] grid){
        //check whether grid[i][j] is valid at the i's row
        for (int i = 0; i < 9; i++)
            if (hasDuplicate(grid[i]))
                return false;
        //check whether grid[i][j] is valid at j's column
        for (int j = 0; j < 9; j++){
            int[] column = new int[9];
            for (int i = 0; i < 9; i++)
                column[i] = grid[i][j];
            if (hasDuplicate(column))
                return false;
        }
        //check whether grid[i][j] is valid in the 3 by 3 box
        for (int i = 0; i < 9; i += 3)
            for (int j = 0; j < 9; j += 3){
                int[] square = new int[9];
                int k = 0;
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 3; j++)
                        square[k++] = grid[i + i][j + j];
                if (hasDuplicate(square))
                    return false;
            }
        return true; //the solution is valid
    }
}
