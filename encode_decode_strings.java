import java.util.ArrayList;
import java.util.List;

public class encode_decode_strings {

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String str : strs) {
            res.append(str.length()).append("#").append(str); // Encode the string in the format: length#string
        }
        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String str) {

        // Decode the string based on the format: length#string
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {

            // Find the length of the string from the format: length#string
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));

            //Finding the indexes of the string
            i = j + 1;  // Move to the start of the string
            j = i +len;  // Move to the end of the string

            // Add the string to the result
            res.add(str.substring(i, j));

            i = j;  // Move to the next string
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("Word");
        strs.add("Encoded");
        strs.add("And");
        strs.add("Decoded");
        System.out.println(encode(strs));
        System.out.println(decode(encode(strs)));
    }

}
