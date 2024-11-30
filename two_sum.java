import java.util.Arrays;
import java.util.HashMap;

public class two_sum {

    // code for checking if there are duplicates in a given array of integers
    public static int[] is_true(int[] nums, int target) {
        HashMap<Integer, Integer> prev_num = new HashMap<>();  // HashMap to store the previous number

        // Loop through the array ana check if the difference between the target and the current number is in the HashMap
        // if it is, return the index of the current number and the index of the difference which is the other required number
        // if it is not, add the current number to the HashMap
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (prev_num.containsKey(diff)) {
                return new int[] {prev_num.get(diff), i};
            }
            prev_num.put(num, i);
        }
        return new int[] {};
    }

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;

        if (is_true(arr, target).length == 0) {
            System.out.println("No two sum solution");
        }
        else {
            System.out.println(Arrays.toString(is_true(arr, target)));
        }
    }
}
