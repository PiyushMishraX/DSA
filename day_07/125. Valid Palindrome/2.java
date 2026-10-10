class Solution {


    public boolean isPalindrome(String s) {
        
        int n = s.length();

        int start = 0;
        int end = n - 1;

        
        while( start < end) {

            // if( !isAlphaNumeric(s.charAt(start)) ) {
            if( isNotAlphaNumeric(s.charAt(start)) ) {
                start++;
                continue;
            }

            // if( !isAlphaNumeric(s.charAt(end)) ) {
            if( isNotAlphaNumeric(s.charAt(end)) ) {
                end--;
                continue;
            }

            // if( Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) ){
            if( convertToLowerCase(s.charAt(start)) != convertToLowerCase(s.charAt(end)) ){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }

    // public boolean isAlphaNumeric(char ch){
    public boolean isNotAlphaNumeric(char ch){
        if((ch>= 'A' && ch<='Z') || (ch>= 'a' && ch<='z') || (ch>= '0' && ch<='9')){
            // return true;
            return false; // not
        }

        // return false;
        return true; // not
    }

    public char convertToLowerCase(char ch){
        if(ch >='A' && ch<='Z')
            ch = (char)(ch + 32);
        return ch;
    }


}