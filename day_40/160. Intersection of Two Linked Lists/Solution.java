import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> nodesInA = new HashSet<>();

        ListNode currentA = headA;

        while( currentA != null ){
            nodesInA.add(currentA);
            currentA = currentA.next;
        }


        ListNode currentB = headB;

        while( currentB != null ){
            if( nodesInA.contains(currentB)) {
                return currentB;
            }

            currentB = currentB.next;
        }

        return null;
        
    }
}