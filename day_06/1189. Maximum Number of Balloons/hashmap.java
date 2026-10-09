import java.util.*;

// check how many instances of word(balloon) can be created with the help of a letters in a given string using hashmap


class Solution {
    public int maxNumberOfBalloons(String text) {
        // the maximum instance is equal to the letter iteration which is minimum

        HashMap<Character, Integer> available = new HashMap<>();
        int n = text.length();

        for(int i = 0 ; i < n; i++ ){
            available.put(text.charAt(i), available.getOrDefault( text.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int res = Integer.MAX_VALUE;

        for( Character key : need.keySet()){

            if( !available.containsKey(key))
             return 0;

            int times = (available.get(key) / need.get(key) );
            res = Math.min(res,times );
        }

        return res;
    }
}