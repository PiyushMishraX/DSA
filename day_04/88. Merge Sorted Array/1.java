class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] arr = new int[m+n];

        // for(int k = 0; k< m+n; k++ ) {
        //     if( nums1[i] =< nums2 ) {
        //     }
        // }

        if(n == 0)
        return;

        int k =0 ;

        while(i < m && j < n) {

            if( nums1[i] <= nums2[j] ) {
                arr[k] = nums1[i];
                // System.out.println(arr[k] + " <-k i-> " + nums1[i] );
                i ++;
            } else  {
                arr[k] = nums2[j];
                // System.out.println(arr[k] + " <-k j-> " +  nums2[j]);
                j++;
            }

            k++;
        }

        if( i < m){
            while(i < m) {
                arr[k] = nums1[i];
                // System.out.println(arr[k] + " <-k i-> " + nums1[i]);
                i++;
                k++;
            }
        } else if ( j < n) {
            while(j < n) {
                arr[k] = nums2[j];
                // System.out.println(arr[k] + " <-k j-> " + nums2[j]);
                j++;
                k++;
            }
        }
        // nums1 = arr; // only the local copy changes not the real nums1

        // for(int l = 0; l < m+n; l++){
        //     nums1[i] = arr[i];
        // } // this also only changes local copy

        System.arraycopy(arr, 0, nums1, 0, arr.length); // arraycopy creates deep copy ( referenced values)

        

    }
}