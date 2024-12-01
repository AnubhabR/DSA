import java.util.*;


public class group_anagrams {
    
    // code for grouping anagrams
    public static List<List<String>> grp_anagram(String[] str){

        Map<String, List<String>> map = new HashMap<>();  // HashMap to store the sorted word and the list of anagrams
        
        // Loop through the array of strings and sort each word
        for(String word : str){

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted_word = new String(chars);

            // if the sorted word is not in the HashMap, add it and add the word to the list
            if(!map.containsKey(sorted_word)){
                map.put(sorted_word, new ArrayList<>());
            }

            // add the word to the list of anagrams
            map.get(sorted_word).add(word);
        }

        // return the list of anagrams
        return new ArrayList<>(map.values());
    }

    // Driver Code
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(grp_anagram(str));
    }
}
