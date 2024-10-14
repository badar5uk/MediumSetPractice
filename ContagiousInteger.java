import java.util.*;

public class ContagiousInteger {

    /*

    Input: Take an array of distinct numbers
    output: Find out if the array is contagious
    A contiguous sequence means that if the smallest element is min and the largest element is max,
    then every integer from min to max should be present in the array without any gaps.
    Example: Input: arr = [10, 14, 10, 12]
    Output: false (there are gaps in the sequence)
    Process: - take the elements and convert to set to make sure they are distinct
             - use tree list to sort
             - use a for loop to check if there are any missing numbers
             - print the missing number
     */

    static Set<Integer> numberSet = new TreeSet<>(Arrays.asList(5, 2, 3, 6, 4, 4, 7));

    public static void main(String[] args) {
        maxAndChecker();
    }

    public static void maxAndChecker() {
        Boolean checker = false;
        List<Integer> numbers = new ArrayList<>(numberSet);
        for (Integer i = numbers.getFirst(); i <= numbers.getLast(); i++) {
            if (numberSet.contains(i)) {
                checker = true;
            }
            else {
                checker = false;
                break;
            }
        }
        System.out.println(checker);
    }
}



