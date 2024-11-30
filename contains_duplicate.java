import java.util.HashMap;

class contains_duplicate {

    // code for checking if there are duplicates in a given array of integers
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int j = 1;  //counting the number of appearances of an int

        for (int element: nums){
            if(list.containsKey(element))  // If the map contains the current int, returns true
                return true;
            else
                list.put(element, j);  // If the map doesn't contain the current int, adds the int to the map
        }
        return false;   // After all the elements have been looped through if there is still no duplicate found, returns false,
    }

    // Driver Code
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,0,9};
        System.out.println(hasDuplicate(array));
    }

    
}