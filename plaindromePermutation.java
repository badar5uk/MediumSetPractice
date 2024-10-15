import java.util.*;

public class plaindromePermutation {

    /*

    Input: Take a string and check if palindrome
    Output: Boolean to say true or false
    Process: - Take string using scanner and remove spaces
             - convert into lower case
             - use a string builder to reverse strings and add to set
             - use a for loop to check for letters
             - add to set and check if there are repetitions
             - use boolean to display if all letters in string are repeating
     */


    public static void main(String[] args) {
        palindromeChecker();
    }

    public static void palindromeChecker() {
        Set<String> comparisonSet = new HashSet<>();
        String x = scannerInp();
        Boolean checker = false;

        for (Integer i = 0; i < x.length(); i++) {
            for (Integer j = i + 1; j <= x.length(); j++) {
                if (isPalindrome(x.substring(i, j))) {
                    comparisonSet.add(x.substring(i, j));
                }
            }
            if (comparisonSet.contains(x)){
                checker = true;
            }
        }
        System.out.println(checker);
    }
    public static boolean isPalindrome(String input) {
        StringBuilder original = new StringBuilder(input);
        StringBuilder reverse = original.reverse();
        return (reverse.toString()).equals(input);
    }

    public static String scannerInp() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a palindrome string: ");
        String word = inp.nextLine();
        word = word.toLowerCase();
        word = word.replace(" ", "");

        return word;
    }

}


