class Solution {
    public void sortColors(int[] nums) {

        // 2 pass method

        // int red0 = 0, white1 = 0, blue2 = 0;
        int red0 = 0, white1 = 0;

        for( int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                red0++;
            } else if( nums[i] == 1){
                white1++;
            } 
            // } else {
            //     blue2++;
            // }
        }


        // for(int j = 0; j < nums.length; j++){

        //     if( red0 != 0 ){
        //         nums[j] = 0;
        //         red0--;
        //     } else if( white1 != 0 ){
        //         nums[j] = 1;
        //         white1--;
        //     } else {
        //         nums[j] = 2;
        //         // blue2--; // not required
        //     }
        // }

        int i =0;
        while(i<nums.length){
            if(i>=0 && i<red0){
                nums[i] = 0;
            }
            if(i>=red0 && i<white1+red0){
                nums[i] = 1;
            }
            if(i>=white1+red0){
                nums[i] = 2;
            }
            i++;
        }
        return ;





        
    }
}