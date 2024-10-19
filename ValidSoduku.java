import java.util.HashSet;
import java.util.Set;

public class ValidSoduku {
    /*
    Input: A 9x9 soduku board
    Output: A boolean or statement to verify if the board is valid or not
    Process: - using a for loop to iterate through rows
             - using a for loop to iterate through columns
             - use a hashset to enter the values of the row, and another hashset for the columns
             - using a for loop to iterate through horizontal and vertical boxes
             -

     */

    public static void main(String[] args) {
        System.out.println(testing());
    }


    public static Boolean testing() {

        Set<Character> rowSet = new HashSet<Character>();
        Set<Character> colSet = new HashSet<Character>();

        Character[][] inputBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // A for loop to check for the rows
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char rowChar = inputBoard[i][j];
                if (rowSet.contains(rowChar)) return false;
                if (rowChar != '.') rowSet.add(rowChar);

                // A for loop to check for the column
                char colChar = inputBoard[j][i];
                if (colSet.contains(colChar)) return false;
                if (colChar != '.') colSet.add(colChar);
            }
            rowSet.clear();
            colSet.clear();
        }

        // A for loop to check each box and iterate through each box
        // m is for the horizontal boxes
        // k is for vertical boxes
        Integer rowMin = 0;
        Integer rowMax = 3;
        Integer colMin = 0;
        Integer colMax = 3;
        for (Integer m = 0; m < 3; m++) {
            for (Integer k = 0; k < 3; k++) {
                for (Integer i = rowMin ; i < rowMax; i++) {
                    for (Integer j = colMin ; j < colMax ; j++) {
                        Character chars = inputBoard[i][j];
                        if (rowSet.contains(chars)) return false;
                        if (chars != '.') rowSet.add(chars);
                    }
                }
                rowSet.clear();
                colMin += 3;
                colMax += 3;
            }
            rowMin += 3;
            rowMax += 3;
            colMin = 0;
            colMax = 2;
        }
        return true;
    }
}
