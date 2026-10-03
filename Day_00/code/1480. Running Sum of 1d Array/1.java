class Solution {
    public int[] runningSum(int[] nums) {

        // int n = nums.length;
        // int[] runningSum = new int[n];

        // runningSum[0] = nums[0];

        // for( int i = 1; i < n ; i++) {
        //     runningSum[i] = runningSum[i-1] + nums[i];
        // }

        // return runningSum;


        // similar
        //  int n = nums.length;
        // int[] runningSum = new int[n];
        // int sum = 0;

        // for(int i = 0; i < n; i ++) { // below
        //     sum = sum + nums[i];
        //     runningSum[i] = sum;
        // }

        // return runningSum;



        // save space in leetcode not much effect really -->

        int sum=0; // saved space complexity beacuse of n i think
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){   
            sum=sum+nums[i];
            result[i]=sum;
            
        }
        return result;
        
    }
}