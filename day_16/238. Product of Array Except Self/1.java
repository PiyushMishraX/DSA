class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] prefixProduct = new int[n]; 
        int[] suffixProduct = new int[n];

        //  can create n + 1 arrays but the last and first of respective are of no use 
        prefixProduct[0] = 1;
        suffixProduct[n - 1] = 1;


        for( int i = 1; i < n; i++){

            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];

            suffixProduct[ n - 1 - i] = suffixProduct[ n - i] * nums[n - i];
        }


        for( int i  = 0; i < n; i++){

            nums[i] = prefixProduct[i] * suffixProduct[i];
        }

        return nums;
        
    }
}