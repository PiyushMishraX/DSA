class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for( int num : amount ) {
            // maxHeap.add(num);
            if (num > 0){
                maxHeap.add(num);
            }
        }

        int count = 0;

        // while(!maxHeap.isEmpty() || maxHeap.size() != 1) {
        // while(!maxHeap.isEmpty() && maxHeap.size() != 1) {
        while( maxHeap.size() > 1 ) {
            int top = maxHeap.poll() - 1;
            int second = maxHeap.poll() - 1;

            // if( !(top <= 0)){
            if( top > 0){
                maxHeap.add(top);
            }
            if( second > 0){
                maxHeap.add(second);
            }

            count++;
        }

        // if( maxHeap.size() == 1){
        if( !maxHeap.isEmpty() ){
            // count++;
            count += maxHeap.poll();
        }

        return count;
        
    }
}