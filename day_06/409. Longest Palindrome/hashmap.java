import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), map.getOrDefault( s.charAt(i) , 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        for(char key : map.keySet()){
            int value = map.get(key);
            if(value % 2 == 0){
                res = res + value;
            } else { // odd value
                res = res + ( value - 1);
                odd = true;
            }
        }

        if( odd ){
            return res + 1; // at least one odd value is present
        }

        return res;
        
    }
}