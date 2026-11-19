class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[101];
        int uniqueCount = 0;

        for (int num : nums) {
            if (num > 0 && !seen[num]) {
                seen[num] = true;
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}