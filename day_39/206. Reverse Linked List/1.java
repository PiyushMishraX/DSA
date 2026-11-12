/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode currentNode = head, p = null, temp;

        while( currentNode != null){

            temp = currentNode.next;

            currentNode.next = p;

            p = currentNode;

            currentNode = temp;
            
        }

        return p;
    }
}