
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class Solution {
    public boolean hasCycle(ListNode head) {

        if( head == null || head.next == null ){
            return false;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;
        
        while( fastNode != null && fastNode.next != null ){
            slowNode = slowNode.next; // 1 move
            fastNode = fastNode.next.next; // 2 moves

            if( slowNode == fastNode ){ // the cycle 
                return true;
            }
        }

        return false;
    }
}