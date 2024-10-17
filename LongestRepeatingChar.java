
import java.util.*;

public class LongestRepeatingChar {

    /*
    Input: String with uppercase AABABBA and integer k
    Output: length of string with either A or B
    process: - Take string and convert into character array
             - Use a for loop to go through each letter
             - use an integer k as the number of changes to be made
             - take a counter to keep track of the letters



Hint: Use a HashSet to keep track of the characters you have seen and maintain a
count of the maximum frequency of any character in the current window.

     */
   static Set<List<Character>> setOfChar = new HashSet<>();
   static List<Character> listOfChar = new ArrayList<>();

    public static void main(String[] args) {
        String originalString = "AABBBBA";
        System.out.println("longest string that can be formed from" +"\n"+"the replacement of the string "+originalString + " is: "+findLongRepCharRepl(originalString,1));

    }

    public static int findLongRepCharRepl(String s, Integer k) {

        int[] counts_char = new int[26];
        Set<Character> charIteration = new HashSet<>();

        Integer j =0;
        Integer maxCounter = 0;
        Integer result = 0;
        Integer counter = 0;

        for(Integer i =0; i < s.length(); i++){
            Character currentChar = s.charAt(i);
            Integer windowSize = i - j + 1;
            charIteration.add(currentChar);

            counter = counts_char[s.charAt(i) - 'A']++;
            counts_char[s.charAt(i) - 'A']++;

            maxCounter = Math.max(maxCounter, counter);


            Integer tempCounter = windowSize - maxCounter;

            if(tempCounter > k){
                counts_char[s.charAt(j) - 'A'] = counts_char[s.charAt(j) - 'A'] - 1;
                j = j + 1;
            }else{
                result = Math.max(result,windowSize - 1 );
            }
        }

        return  result;
    }
}
