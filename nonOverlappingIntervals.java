import java.util.*;

public class nonOverlappingIntervals {
    /*
Input: A list of a list of intervals
Output: the number of non overlapping intervals
Process : -

 */
    static List<List<Integer>> listOfList = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(2, 3),
            Arrays.asList(3, 4),
            Arrays.asList(1, 3)
    );
    static Set<Integer> setOfList = new HashSet<>();

    public static void main(String[] args) {

        Integer prev_end = listOfList.get(0).get(1);
        Integer res = 0;

        for (Integer i = 1; i < listOfList.size(); i++) {
            if (prev_end > listOfList.get(i).get(0)) {
                res++;
            } else {
                prev_end = listOfList.get(i).get(1);

            }
        }
        System.out.println("The number of non-overlapping Intervals is: " + res);
    }
}
