class Solution {
    public void reverseString(char[] s) {

        int n = s.length;

        // for(int i = 0; i< n/2 ; i++){ // 
        //     char temp = s[i];
        //     s[i] = s[n - i - 1];
        //     s[n - i - 1] = temp;
        // }

        // Two pointeer -->

        int start = 0;
        int end = n - 1;

        // while(start <= end) {
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start ++;
            end--;
        }

        
    }
}