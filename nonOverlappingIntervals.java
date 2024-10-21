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
    static Set<List<Integer>> setOfList = new HashSet<>();

    public static void main(String[] args) {

        Integer prevEnd = listOfList.get(0).get(1);

        for (Integer i = 0; i < listOfList.size(); i++) {
            if (prevEnd > listOfList.get(i).get(1)) {

            } else {
                prevEnd = listOfList.get(i).get(1);
                setOfList.add(listOfList.get(i));

            }
        }
        System.out.println("The non-overlapping Intervals are: " + setOfList);
    }
}
