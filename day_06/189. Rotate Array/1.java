class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // int[] nums2 = nums; // shallow copy
        int[] nums2 = nums.clone();
        // int[] nums2 = new int[n];

        for( int i = 0; i < n; i ++ ){
            // nums2[(i+k) % n] = nums[i];

            int idx = ((i+k) % n); // read have to rotate to right direction s
            // nums[i] = idx;
            nums[idx] = nums2[ i ]; // moving element to right from left side
        }

        // return nums2;
        // nums = nums2;
        // nums = Arrays.copyOf(nums2, nums2.length);
        
    }
}