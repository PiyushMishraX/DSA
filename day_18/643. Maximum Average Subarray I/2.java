class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;
        // int max = Integer.MIN_VALUE;

        for( int i=0 ; i < k ; i++ ) 
            sum += nums[i];

        // max = Math.max(max_sum, sum);
        int max = sum;;

        int low = 0;
        int high = k;

        while( high < n ){
            sum = sum - nums[low] + nums[high];
            max = Math.max( max , sum);

            low++;
            high++;
        }

        return max / (double) k;

        
    }
}