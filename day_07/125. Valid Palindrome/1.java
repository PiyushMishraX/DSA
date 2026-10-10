class Solution {


    public boolean isPalindrome(String s) {
        
        int n = s.length();

        int start = 0;
        int end = n - 1;

        while( start < end) {
            // if( s.charAt(start) == " " ) {
            if( !Character.isLetterOrDigit(s.charAt(start)) ) {
                start++;
                continue;
            }
            // if( s.charAt(end) == " " ) {
            if( !Character.isLetterOrDigit(s.charAt(end)) ) {
                end--;
                continue;
            }


            // if( s.charAt(start) != s.charAt(end)){
            if( Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) ){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }
}