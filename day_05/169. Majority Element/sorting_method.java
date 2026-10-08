import java.util.Arrays;


class Solution {
    public int majorityElement(int[] nums) {

        // int number = 0;

        // // int max = Integer.MIN_VALUE; // not required check if count > n/2 as one value always present being > n/2 appearance also only one cna have this feat so no need to store max
        // for( int i = 0; i < nums.length; i ++) {
        //     int count = 1;
        //     for(int j = i + 1; j < nums.length; j ++) {
        //         if( nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > nums.length/2){
        //         // return nums[i];
        //         number = nums[i];
        //         break;
        //     }
        // }

        // // return 0;
        // return number; // in case no value are this which is not the case better would be set anything else than the values that might run

        Arrays.sort(nums);
        int count = 1;
        int number = nums[0];

        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }


            if( count > nums.length/2) {
                number = nums[i];
            }
        }

        return number;



        
    }
}