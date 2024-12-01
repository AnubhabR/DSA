import java.util.Arrays;
import java.util.Scanner;

public class valid_anagram_optimized {

    // code for checking if two strings are anagrams of each other
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // convert the strings to Character arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // sort the character arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // compare the sorted character arrays
        return Arrays.equals(sArr, tArr);
    }

    // Driver Code
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // input the strings and convert it to lowercase
            System.out.print("Enter a string (s): ");
            String s = sc.next().toLowerCase();

            System.out.print("Enter another string (t): ");
            String t = sc.next().toLowerCase();

            // check if the strings are anagrams and print the result
            System.out.println(isAnagram(s,t));
        }
    }
}