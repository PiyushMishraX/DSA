class Solution {
    public int maxProfit(int[] prices) {


        // brute force ( TLE ) -->
        // int maxP = 0;

        // for(int i = 0; i < prices.length - 1; i++ ){
        //     for(int j = i +1; j < prices.length; j ++){
        //         if(prices[j] - prices[i] > maxP ){ // always sell - buy for profit
        //             maxP= prices[j] - prices[i];
        //         }
        //     }
        // }

        // int maxP = 0;
        // int minPrice = prices[0]; // only have to check once per interation not n times

        // for(int i = 1; i < prices.length; i++){

        //     if(prices[i] < minPrice){
        //         minPrice = prices[i];
        //         continue;
        //     }

        //     if( prices[i] - minPrice > maxP ){
        //         maxP = prices[i] - minPrice;
        //     }
        // }

        // return maxP;



        int max = 0;
        int buy = 100000;
        for (int i = 0; i< prices.length; i++){
            if(prices[i]<buy)
                buy = prices[i];

            max = Math.max(max, prices[i] - buy); 
        }
        
        return max;

        
    }
}