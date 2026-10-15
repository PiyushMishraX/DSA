class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int total = 0;

        for(int i = 0; i < n; i++){
            total += nums[i];
        }   

        int sumLeft = 0;

        for( int i = 0; i < n; i ++){
            // if( sumLeft == totalSum - leftSum - nums[i])
            if( sumLeft == total - sumLeft - nums[i]) { // total - sumLeft -> right sum and nums[i] to reduce current index
                return i;
            }

            sumLeft += nums[i];
        }

        return -1;
    }
}