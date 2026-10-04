class Solution {
    public int maximumWealth(int[][] accounts) {

        // length in 2d array
        // int rows = accounts.length;
        // int columns = accounts[0].length;
        
        // int wealth = 0, maxWealth = 0;

        // int rows = accounts.length;
        // // but in java m and n may or may not be euqal


        // for(int i = 0; i < rows; i++) {
        //     wealth = 0;
        //     for(int j = 0; j < accounts[i].length; j++ ){
        //         wealth += accounts[i][j];
        //     }
        //     if( wealth > maxWealth ) {
        //         maxWealth = wealth;
        //     }
        // }

        // return maxWealth;


        // lesser expected space complexity
        int maxWealth = 0;

        for(int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            // if(wealth >= maxWealth){
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }
}