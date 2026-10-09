// using sorting method
// 2 hashmaps
// single hashmap

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        // using sorting method -->
        
        // check length if not equals then not anagram
        // if(s.length() != t.length()){
        //     return false;
        // }

        // // convert to char array
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // // sort array
        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a,b);



        // Using hashtables/ maps

        // if(s.length() != t.length() ){
        //     return false;
        // }

        // int n = s.length();

        // HashMap<char, Integer> s1 = new HashMap<>();
        // HashMap<cahr, Integer> t1 = new HashMap<>();
        // HashMap<Character, Integer> s1 = new HashMap<>();
        // HashMap<Character, Integer> t1 = new HashMap<>();

        // for( int i = 0; i < n; i ++){
        //     s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0) + 1); // 0 default so + 1 gives 1
        //     t1.put(t.charAt(i), t1.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // only voi return type
        // s1.forEach((key, value) -> {
        //     // if(t1.containsKey == false) continue;
        //     if( t1.containsKey(key) == false || value != t1.get(key)) { // if key does not exist in t1 or appears less or more no. time // then false
        //         return false;
        //     }
        // });

        // boolean yn  = true;
        // s1.forEach((key, value) -> {
        //     // if(t1.containsKey == false) continue;
        //     if( t1.containsKey(key) == false || value != t1.get(key)) { 
        //         yn = false;
        //         break;
        //     }
        // });
        // return yn;




        // for( char key: s1.keySet()){
        //     // if(t1.containsKey(key) == false || s1.get(key) != t1.get(key)) {
        //     //     return false;
        //     // }
        //     // s1.get(key) != t1.get(key) compares object memory locations instead of values, so equal characters outside the 0–127 cache range evaluate as unequal (true), triggering the return false.

        //     if( !t1.containsKey(key) || !Objects.equals(s1.get(key) , t1.get(key) )) {
        //         return false;
        //     }
        // }

        // return true;


        // method 2 single HahsMap

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1); // count frequency
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch) - 1); // remove one when a freq is matched

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty(); // if map becomes empty then anagram true
    }
}