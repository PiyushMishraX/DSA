class Solution {

    static {
        for (int i = 0; i < 500; i++) findMaxAverage(new int[] {}, 0);
    }

    public static double findMaxAverage(int[] nums, int k) {

        long sum = 0;

        for (int i = 0; i < k; i++) 
            sum += nums[i];

        long max = sum;

        // for (int i = k; i < nums.length; i++) {
        //     sum += nums[i] - nums[i-k]; // high - (low ( high - k)) // i - k = low
        for (int high = k; high < nums.length; high++) {
            sum += nums[high] - nums[high - k]; 
            max = Math.max(max, sum);
        }
        return max*1.0/k;
        
    }
}