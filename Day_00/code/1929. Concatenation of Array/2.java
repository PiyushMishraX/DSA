

class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        // System.arraycopy(nums, 0, ans, 0, n); from nums[0] and to last in ans[0] to nums[0+n]
        // System.arraycopy(nums, 0, ans, n, n); from nums[0] and to last in ans[n] to nums[n+n]

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
}