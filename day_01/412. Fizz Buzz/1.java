import java.util.List;
import java.util.ArrayList;
// import  java.util.*;;

class Solution {
    public List<String> fizzBuzz(int n) {

        // String[] answer = new String[n]; // return type is array list 
        List<String> answer = new ArrayList<>();

        // for(int i = 1 ; i <= n; i ++) {

        //     // if(i % 3 == 0 ){
        //     //     if(i % 5 == 0) {
        //     //         // answer[i] = "FizzBuzz"; 
        //     //         answer.add("FizzBuzz");
        //     //     } else {
        //     //         // answer[i] = "Fizz";
        //     //         answer.add("Fizz");
        //     //     }
        //     // } else if( i % 5 == 0 ) {
        //     //     // answer[i] = "Buzz";
        //     //     answer.add("Buzz");
        //     // } else {
        //     //     // answer[i] = String.valueOf(i);
        //     //     answer.add(String.valueOf(i));
        //     // }


        //     if(i%15 == 0) answer.add("FizzBuzz");
        //     else if(i%3 == 0) answer.add("Fizz");
        //     else if(i%5 == 0) answer.add("Buzz");
        //     else answer.add(String.valueOf(i));
        // }


        for(int i = 1 ; i <= n ; i++){
            if(i % 15 == 0){
                answer.add("FizzBuzz");
            }else if(i % 3 == 0){
                answer.add("Fizz");
            }else if(i % 5 == 0){
                answer.add("Buzz");
            }else answer.add("" + i);
        }

        return answer;
        
    }
}