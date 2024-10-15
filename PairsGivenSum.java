import java.util.*;

public class PairsGivenSum {
        /*

    Input: array of Integers with pairs, target sum
    Output: unique pairs that add up to the target sum
    Example: Input: arr = [1, 5, 7, -1, 5], target = 6
             Output: [(1, 5), (-1, 7)]

    Process: - Take an array and add to a Hashset
             - Use a for loop to iterate through elements and sum each pair
             - use an if statement to check if the sum is equal to target
             - return the values
     */

    public static void main(String[] args) {

        Integer target = 6;

        List<Integer> numbers = List.of(1, 5, 7, -1, 5);
        Set<List<Integer>> setOfSets = new HashSet<>();

        for (Integer i = 0; i < numbers.size() - 2; i++) {
            for (Integer j = i + 1; j < numbers.size() - 1; j++) {
                if (i != j) {
                    if (target == (numbers.get(i) + numbers.get(j))) {
                        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(numbers.get(i), numbers.get(j)));
                        setOfSets.add(secondList);
                    }
                }
            }
        }
        System.out.println(setOfSets);
    }
}
