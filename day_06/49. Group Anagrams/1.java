import java.util.*;

class Solution {

    // check if anagram 
    public boolean isAnagram(String s1, String s2){

        // length not equal not anagram
        if(s1.length() != s2.length()) {
            return false;
        }


        // convert to character array 
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();


        // sort arrays , bcz we check combination
        Arrays.sort(a);
        Arrays.sort(b);

        // check if they are euqal which means they are anagram
        return Arrays.equals(a, b);
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>(); // creating array List of (  array Lists contatining strings )
        boolean[] used = new boolean[strs.length]; // array of booleans to set used true ( so one string in one group only ) 



        for(int i =0; i < strs.length; i++){
            if(used[i])
                continue;
                // if not used then this runs

            List <String> group = new ArrayList<>(); // add in group
            group.add(strs[i]);

            used[i] = true; // set used true

            for(int j= i+1; j<strs.length; j++){ // loop after the string till end

                if( !used[j] && isAnagram(strs[i], strs[j])) { // if the value isn't used and isAnagram t strs[i]
                // add in group

                    group.add(strs[j]);
                    used[j] = true;
                }

            }

            // add group in result
            result.add(group);
        }

        return result;
    }
}