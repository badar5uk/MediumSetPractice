
import java.util.*;

public class LongestRepeatingChar {

    /*
    Input: String with uppercase AABABBA and integer k
    Output: length of string with either A or B
    process: - Take string and convert into character array
             - Use a for loop to go through each letter
             - use an integer k as the number of changes to be made
             - take a counter to keep track of the letters
     */

    public static void main(String[] args) {
        String originalString = "AABBBBA";
        System.out.println("longest string that can be formed from" + "\n" + "the replacement of the string " + originalString + " is: " + findLongRepCharRepl(originalString, 1));

    }

    private static final Integer ALPHABET_SIZE = 26;

    public static int findLongRepCharRepl(String s, int k) {

        int[] countsChar = new int[ALPHABET_SIZE];
        int j = 0, maxCounter = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            countsChar[s.charAt(i) - 'A']++;
            maxCounter = Math.max(maxCounter, countsChar[s.charAt(i) - 'A']);

            while (i - j + 1 - maxCounter > k) {
                countsChar[s.charAt(j) - 'A']--;
                j++;
            }

            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }
}
