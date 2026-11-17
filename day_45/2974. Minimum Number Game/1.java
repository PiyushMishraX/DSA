import java.util.PriorityQueue;

class Solution {
    public int[] numberGame(int[] nums) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for( int num : nums ){
            minHeap.add(num);
        }

        int[] arr = new int[nums.length];
        int i = 0;

        while (!minHeap.isEmpty()) {
            // int alice = minHeap.poll();
            // int bob = minHeap.poll();

            // arr[i] = bob;
            // arr[i+1] = alice;

            int alice = minHeap.poll();

            arr[i] = minHeap.poll(); // bob
            arr[i+1] = alice;

            i += 2;

        }
        
        return arr;
    }
}