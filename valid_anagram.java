import java.util.HashMap;

public class valid_anagram {

    //Checking if two entered strings are anagrams or not
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;   //Checks if length two strings are equal to eliminate the obvious

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // This section converts the string to a character array and enters that into a hashmap,
        // if that character already exists then we skip just increase the value associated with it
        // if that character doesn't exist we just add that element  to the map
        // we do this for both the strings

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // This section checks if the two maps are equal or not
        return map1.equals(map2);
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(isAnagram("pool", "loop"));
    }
}
