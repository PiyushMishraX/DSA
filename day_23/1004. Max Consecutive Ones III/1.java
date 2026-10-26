class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int[] freq = new int[2];
        int low = 0, max = 0;
        int zeros = 0;

        for( int high = 0; high < n; high++){

            if (nums[high] == 0){
                zeros++;
            }

            while( zeros > k){
                if ( nums[low] == 0){
                    zeros--;
                }
                low++;
            }

            // int len = high - low + 1;
            max = Math.max( max, high - low + 1);
        }

        return max;
        
    }
}