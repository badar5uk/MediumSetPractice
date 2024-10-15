import java.lang.reflect.Array;
import java.util.*;

public class MissingElementRange {

    /*
    Input: Take an array of distinct numbers
    output: the missing numbers from the arrray
    Example: Input: [3, 0, 1] Output: 2
    Process: - take the elements and convert to set to make sure they are distinct
             - use tree set to sort
             - define upper and lower limit of range
             - use a for loop to check if there are any missing numbers
             - print the missing number
     */

    static Set<Integer> numberSet = new TreeSet<>(Arrays.asList(1, 3, 5, 7));

    public static void main(String[] args) {
        maxAndChecker();
    }

    public static void maxAndChecker() {
        Integer lower = 1;
        Integer upper = 10;
        Set<Integer> missing = new TreeSet<>();
        for (Integer i = lower; i <= upper; i++) {
            if (!numberSet.contains(i)) {
                missing.add(i);
            }
        }
        System.out.println("The missing numbers from the range are: " +missing);
    }
}



