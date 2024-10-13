import java.lang.reflect.Array;
import java.util.*;

public class MissingElementRange {

    /*
    Input: Take an array of distinct numbers
    output: the missing numbers from the arrray
    Example: Input: [3, 0, 1] Output: 2
    Process: - take the elements and convert to set to make sure they are distinct
             - use tree list to sort
             - use a for loop to check if there are any missing numbers
             - print the missing number
     */

    static Set<Integer> numberSet = new TreeSet<>(Arrays.asList(0, 1, 15, 8, 9, 10, 11, 12, 13, 14, 3, 4, 5, 6));

    public static void main(String[] args) {
        maxAndChecker();
    }

    public static void maxAndChecker() {
        Set<Integer> missing = new TreeSet<>();
        for (Integer i = 0; i < numberSet.size(); i++) {
            if (!numberSet.contains(i)) {
                missing.add(i);
            }
        }
        System.out.println("The missing numbers from the range are: " +missing);
    }
}



