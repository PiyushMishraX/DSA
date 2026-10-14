class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;


        int left = 0;
        int right = height.length - 1;
        // int leftMax = 0;
        // int rightMax = 0 ;
        int totalWater = 0;

        // while( left<right ){

        //     if( height[left]<height[right] ){

        //         if( height[left] >= leftMax ){
        //             leftMax = height[left];
        //         }
        //         else{
        //             totalWater += leftMax - height[left];
        //         }

        //         left++;

        //     }   else{

        //         if(height[right]>= rightMax){
        //             rightMax = height[right];
        //         } else{
        //             totalWater += rightMax - height[right];
        //         }

        //         right--;
        //     }
        // }




        int leftMax = height[left];
        int rightMax = height[right] ;




         while (left < right) {
            if (leftMax < rightMax) {

                left++;
                leftMax = Math.max(leftMax, height[left]);
                totalWater += leftMax - height[left];

            } else {

                right--;
                rightMax = Math.max(rightMax, height[right]);
                totalWater += rightMax - height[right];

            }
        }

        return totalWater;
    }
}