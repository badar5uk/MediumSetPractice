import java.util.*;

public class DistinctElementWindow {

    /*
    Input: Take an array of integers and a positive integer k, slide a "window" of size k over the array
    from left to right. For each position of this window, count the number of distinct elements inside the window and
    store these counts in a result list.
    Output: distinct elements in that window
    Process: - define a window of integer k
             - have a for loop that goes through the elements in the size of the window
             - create a new array and store the unique numbers in a set
             - get the size of the set and add it to a new array
             - print the array

Input: arr = [1, 2, 1, 3, 4, 2, 3], k = 4 Output: [3, 4, 4, 3]

Explanation: The windows and their distinct element counts are:

[1, 2, 1, 3] → 3 distinct elements: [1, 2, 3]

[2, 1, 3, 4] → 4 distinct elements: [1, 2, 3, 4]
     */
    static List<Integer> listNumbers = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 2, 3));
    static Integer window = 4;
    static Set<Integer> uniqueSet = new HashSet<>();

    public static void main(String[] args) {
        loop();

    }

    public static void loop() {

        List<Integer> windowList = new ArrayList<>();
        List<Integer> storingList = new ArrayList<>();

        for (Integer i = 0; i <= listNumbers.size() - window; i++) {
            windowList = listNumbers.subList(i, i + window);
            uniqueSet= new HashSet<>(windowList);
            storingList.add(uniqueSet.size());

        }
        System.out.println("Original list: "+listNumbers);
        System.out.println("number of unique elements in window "+window+" is: " +storingList);
    }

}


