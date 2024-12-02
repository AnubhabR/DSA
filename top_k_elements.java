import java.util.*;

public class top_k_elements {

    // Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public static int[] topKFrequent(int[] nums, int k) {

        // Create a map to store the frequency of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Create a bucket to store the elements based on their frequency
        List<Integer>[] bucket = new List[nums.length + 1];

        // Count the frequency of each element
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Add the elements to the bucket based on their frequency
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Get the top k elements
        int[] res = new int[k];
        int counter = 0;

        // Traverse the bucket from the end
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--){
            // If the bucket is not empty, add the elements to the result
            if(bucket[pos] != null){

                // Add the elements to the result
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;

                    if(counter == k){
                        return res;
                    }
                }
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

}
