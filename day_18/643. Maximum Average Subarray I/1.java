class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // int low = 0, high = k - 1;
        // double avg = 0;


        // // for( int i  = 0; i <= high; i++){ 
        // for( int i  = 0; i <= k - 1 ; i++){ 
        //     avg += (double)  nums[i] / k ;
        // }

        // double max = avg;

        // int low = 1 , high = k;

        // while( high < nums.length){
        //     avg += ( double) ( (double) ( nums[high] - nums[low] ) / k );

        //     max = Math.max( avg, max);


        //     low++;
        //     high++;
        // }

        // return max;

        //  if sum is bigger than sum / k would be bigger too ( k positive)
         //  if sum is bigger than sum / k would be bigger too ( k positive)

        double sum = 0;


        // for( int i  = 0; i <= high; i++){ 
        for( int i  = 0; i <= k - 1 ; i++){ 
            sum += nums[i];
        }
        
        double max = sum;

        int low = 0 , high = k; // have to add original high + 1 but remove the original low ( 0 )

        while( high < nums.length){
            sum +=  nums[high] - nums[low] ;

            max = Math.max( sum, max);


            low++;
            high++;
        }

        return  max / (double) k;



        



        
    }
}