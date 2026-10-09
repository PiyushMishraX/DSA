import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // if we sort this we can just use two pointers but which is not the point 
        // have to solve without solving

        // if( k > nums.length ) return // its guranteed that k unique elements exists

        HashMap< Integer, Integer> map = new HashMap<>();

        for(int i  = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }


        // int[] arr = new arr[map.size()];


        // Deque<Integer> boundedDeque = new LinkedBlockingDeque<>(k);

        // for(int i = 0; i  < k ; i ++){
        //     boundedDeque.addFirst(MIN_VALUE);
        // }

        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // for(int key: map.keySet()) {
        //     maxHeap.add()
        // }


        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );

        for(int key: map.keySet()) {
            maxHeap.add(Map.entry(key, map.get(key)));
        }

        int[] topElem = new int[k];
        for(int i =0 ; i < k; i ++){
            topElem[i] = maxHeap.poll().getKey();
        }


        return topElem;



        // // int[] maxFreq = new int[2];
        // // maxFreq[0] = Integer.MIN_VALUE;
        // // maxFreq[1] = Integer.MIN_VALUE;
        // // int[] topElem = new int[2];
        // // for(int key: map.keySet()) {
        // //     if( map.get(key) > maxFreq[0]){
        // //         maxFreq[0] = map.get(key);
        // //         topElem[0] = key;
        // //     } else if( map.get(key) > maxFreq[1]){
        // //         maxFreq[1] = map.get(key);
        // //         topElem[1] = key ;
        // //     }
        // // }
        // // return topElem;
        
    }
}