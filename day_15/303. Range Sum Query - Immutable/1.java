class NumArray {

    // // private int[] num1;
    // private int[] prefixSum;


    // public NumArray(int[] nums) {
    //     // this.num1 = nums;   
    //     prefixSum = new int[nums.length + 1];

    //     for( int i = 0; i < nums.length; i++){
    //         prefixSum[i + 1] = prefixSum[i] + nums[i];
    //     } 
    // }
    
    // public int sumRange(int left, int right) {

    //     // int sum = 0;

    //     // for(int i = left; i <= right; i ++){
    //     //     sum += num1[i];
    //     // }

    //     // return sum;


    //     return prefixSum[ right + 1] - prefixSum[left];

    // }





    int[] prefixSum;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        prefixSum = new int[n];
        prefixSum[0]=nums[0];

        for(int i = 1 ; i < n ; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
       if(left>0) return prefixSum[right]-prefixSum[left-1];
       return prefixSum[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */