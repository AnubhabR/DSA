public class product_except_self {

    static int[] product_finder(int[] nums){
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for(int i = 1; i<n; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int postfix = 1;
        for (int i = n-1; i>=0; i--){
            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] res = product_finder(arr);

        for (int i : res){
            System.out.print(i + " ");
        }

    }
}
