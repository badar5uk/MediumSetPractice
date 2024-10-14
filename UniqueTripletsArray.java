import java.util.*;

public class UniqueTripletsArray {

    /*
    Input: array of Integers with triplets
    Output: unique triplets and their sum must equal to zero
    Example: Input: nums = [-1, 0, 1, 2, -1, -4]    [-4,-1,-1,0,1,2]
             Output: [[-1, -1, 2], [-1, 0, 1]]

    Process: - Take an array and add to Treeset ( make sure List as array list is seperate)
             - Use a for loop to iterate through elements and sum only 3 indices
             - use an if statement to check if the sum is equal to zero
             - return the values
     */

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-1, 0, 1, 2, -1, -4);
        Set<List<Integer>> setOfSets = new HashSet<>();

        for (Integer i = 0; i < numbers.size() - 2; i++) {
            for (Integer j = i + 1; j < numbers.size() - 1; j++) {
                for (Integer k = j + 1; k < numbers.size(); k++) {
                    Set<Integer> numberSet = new HashSet<>();

                    if (j != k) {
                        if (0 == (numbers.get(i) + numbers.get(j) + numbers.get(k))) {
                            List<Integer> secondList = new ArrayList<>(Arrays.asList(numbers.get(i), numbers.get(j), numbers.get(k)));
                            setOfSets.add(secondList);
                        }
                    }
                }
            }
        }
        System.out.println(setOfSets);
    }
}

