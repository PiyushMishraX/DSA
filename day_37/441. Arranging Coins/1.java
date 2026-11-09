class Solution {
    public int arrangeCoins(int n) {

        int count = 1;
        // int 

        while( n > 0){

            n = n - (count + 1);

            count++;
        }

        return count - 1; // for 1 
        
    }
}