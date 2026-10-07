class Solution {
    public boolean isPalindrome(int x) {
        
        // String x1 = String.valueOf(x);
        // char[] x2 = x1.toCharArray();

        // for(int i = 0; i < (x2.length/2) ; i ++  ){
        //     if( x2[i] != x2[x2.length - 1 - i] )  return false;
        // }

        // return true;

        if( x < 0)
        return false;

        int x1 = x; 
        int reverse = 0;


        while(x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;

            x = x / 10;
        }

        // if( reverse == x){
        //     return true;
        // } 

        // return false;

        return x1 == reverse;


        
    }
}