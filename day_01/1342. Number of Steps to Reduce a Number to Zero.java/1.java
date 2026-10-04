class Solution {
    public int numberOfSteps(int num) {

       // method 1 --> 
        // int count = 0;

        // while ( num != 0 ) {

        //     if(num % 2 == 0){
        //         num = num / 2;
        //         count++;
        //     } else {
        //         num = num - 1;
        //         count++;
        //     }
        // }

        // return count;




    // method 2 -->
        
        // if(num == 0) return 0; // if zero return 0
        // if(num%2 == 0) // if devsble by zero , use number of step
        // return 1 + numberOfSteps(num/2); // reduce -1 if odd num and divide by /2 for even number till "0" reached ( we are performing the /2 step so add + 1 in return value)
        // // numberOfSteps use bitwise to chekc even
        // return 1 + numberOfSteps(num-1); 

    
    // method 2.5 -->

        if(num == 0) return 0;
        int count = 0;
        while(num>0 ){
            // if((num%2) == 0){
            if((num & 1) == 0){ // bitwise faster // num is even than num & 1 == 0
                num = num / 2;
            } else {
                num --;
            }
            count ++;
        }

        return count;

    }
}