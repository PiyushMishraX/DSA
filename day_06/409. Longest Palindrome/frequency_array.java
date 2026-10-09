class Solution {
    public int longestPalindrome(String s) {
        // using freqency array 

        int[] freq = new int[58]; // 'z' -> 122 // 'A'-> 65 // differnece 57 + 1

        for( char ch: s.toCharArray()){
            freq[ch - 'A']++; // 'A' - 'A' -> 65 - 65 = 0
        }

        int res = 0;
        boolean odd = false;

        for( int i : freq ){
            if(i % 2 == 0){
                res += i;
            }
            else{ // i % 2 != 0
                res += i - 1;
                odd = true;
            }
        }

        if(odd)
            return res + 1;
        
        return res;
    }
}