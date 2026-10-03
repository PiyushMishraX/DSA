class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] numbers = new int[5];
        // int[] ans = new int[nums.length * 2];

        // for( int i = 0; i<nums.length; i++) {
        //     ans[i] = nums[i];
        //     ans[i+nums.length] = nums[i];
        // }

        int n = nums.length;
        int[] ans = new int[n * 2];

        for( int i = 0; i<n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}