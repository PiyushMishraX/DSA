class Solution {
    public int arrangeCoins(int n) {

        long left = 1, right = n;

        while( left <= right){
            long mid = left + ( right - left) /2;

            long total = mid * ( mid + 1)/2;

            if( total == n){
                return (int)mid;
            }
            
            if( total < n ){
                left = mid + 1;
            } else { // total > n
                right = mid - 1;
            }
        }

        return (int) right;
    }
}