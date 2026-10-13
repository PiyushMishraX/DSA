class Solution {
    public int maxArea(int[] height) {

        //  2 <= n <= 10 ^ 5 , too height O(n^2)

        int max = 0;
        int n = height.length;

 
        int left = 0;
        int right = n  - 1;

        while( left < right){
            if( height[left] <= height[right] ){

                if( max < (right - left) * height[left] ){
                    max = (right - left) * height[left];
                }

                left++;
            }

            // else if ( height[left] > height[right]  )
            else {
                
                if( max < ( right - left ) * height[right] ){
                    max = ( right - left ) * height[right];
                }

                right--;
            }
        }





        return max;
        
    }
}