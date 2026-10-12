// Triplets with Smaller Sum

class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        
        Arrays.sort(arr); 
        
        int n = arr.length;
        
        int ans = 0;
        
        for( int i = 0; i < n -2; i++){
            if( i > 0 && arr[i] == arr[i-1]) // unique elements only so not have to check the values such as the  // but let be a safe guard
             continue;
             
             int left = i +1, right = n -1;
             
             while( left < right){
                 
                 int sum1 = arr[i] + arr[left] + arr[right];
                
                 
                 if( sum1 >= sum ){
                     right--;
                 } else {
                     ans = ans + (right - left);
                     left++;
                 }
             }
        }
        
        return ans;
    }
}