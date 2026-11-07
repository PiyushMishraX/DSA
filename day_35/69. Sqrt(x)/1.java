class Solution {
    public int mySqrt(int x) {

        if( x == 1 ){
            return 1;
        } else if ( x == 0){

            return 0;
        } 


        long low = 1;
        long high = x/2;

        long ans = 0;

        while( low <= high){
            long mid = low + (high - low)/2;

            long midSquare = mid*mid;



            // if( midSquare == num){
            //     return true;
            // }

            if ( midSquare <= x) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }

        }

        return ( int ) ans;
        
    }
}