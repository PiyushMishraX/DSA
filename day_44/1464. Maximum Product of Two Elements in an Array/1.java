import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
 
        for( int i : nums ) {
            maxHeap.add(i);
        }
        
        int max1 = maxHeap.poll();
        int max2 = maxHeap.poll();
        
        return ( max1 - 1 ) * ( max2 - 1 );
    }
}