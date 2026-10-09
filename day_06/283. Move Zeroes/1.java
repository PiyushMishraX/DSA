class Solution {
    public void moveZeroes(int[] nums) {

        // int j = -1;

        // for( int i = 0 ; i < nums.length; i ++) {
        //     if( nums[i] == 0) continue;
        //     else if ( nums[i] != 0){
        //         j++;
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        // }


        int k = 0;

        // move all non zero elements to front 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }

        // put zero in the end
        while(k<nums.length){
            nums[k] = 0;
            k++;
        }
        
    }
}