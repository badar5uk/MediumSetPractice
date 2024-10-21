import java.util.*;

public class nonOverlappingIntervals {
    /*
Input: A list of a list of intervals
Output: the number of non overlapping intervals
Process : -

 */
    static  Integer[][] intervals = { {1, 2}, {2, 3}, {3, 4}, {1, 3} };
    static Set<Integer> setOfList = new HashSet<Integer>();

    public static void main(String[] args) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        Integer prevEnd = intervals[0][1];
        Integer counter =1;

        for (int i = 1; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start>=prevEnd && !setOfList.contains(end)) {
                prevEnd = end;
                setOfList.add(end);
                counter++;

            }
        }
        System.out.println("The non-overlapping Intervals are: " + counter);
    }
}