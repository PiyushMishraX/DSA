class Solution {
    public int removeElement(int[] nums, int val) {

        // int m = -1, n = 0;
        // int count = 0;

        // for( int i = 0; i < nums.length; i ++) {
        //     if( nums[i] != val) {
        //         m++;
        //         int temp = nums[i];
        //         nums[i] = nums[m];
        //         nums[m] = temp;

        //         count ++;
        //     }
        // }

        // return count;



        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}