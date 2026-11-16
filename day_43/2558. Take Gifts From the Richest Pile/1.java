import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for ( int i : gifts ){
            maxHeap.add(i);
        }


        for( int i = 0; i < k ; i++){

            int n = maxHeap.poll();
            n = (int) Math.sqrt(n);

            maxHeap.add(n);
        }

        long sum = 0;
        for( int i = 0; i < gifts.length; i++ ){
            sum += maxHeap.poll();
        }

        return sum;
        
    }
}