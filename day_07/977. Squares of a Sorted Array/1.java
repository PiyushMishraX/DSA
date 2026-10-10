class Solution {
    public int[] sortedSquares(int[] A) {

        int n = A.length;

        int idx = -1;;
        boolean idxFound = false;
        
        for(int i =0 ; i < n; i++){
            if( A[i] >= 0  && !idxFound){
                idx = i;
                idxFound = true;
            }

            A[i] = A[i] * A[i];
        }


        if(idx == 0){
            return A;
        }

        if( idx == -1){
        
            for(int i =0; i < n/2; i ++){
                int temp = A[i];
                A[i] = A[n - i -1];
                A[n - i -1] = temp;
            }

            return A;
            
        }

        int n1 = idx;
        int n2 = idx - 1;

        int[] res = new int[n];
        int k = 0;

        while( n1 < n && n2 > -1 ){
            if(A[n1] <= A[n2]) {
                res[k] = A[n1];
                k++;
                n1++;
            }

            else{
                res[k] = A[n2];
                k++;
                n2--;
            }
        }

        while(n1 < n){
            res[k] = A[n1];
            k++;
            n1++;
        }
        while(n2 > -1){
            res[k] = A[n2];
            k++;
            n2--;
        }

        return res;
    }
}