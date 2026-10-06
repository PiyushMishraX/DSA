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
class Solution {
    public ListNode middleNode(ListNode head) {
        int num = 0;

        ListNode current = head;

        
        while(current != null) {
            current = current.next;
            num ++;
        }

        int n = (num/2) + 1 ;
        ListNode newCurrent ;
        current = head;
        for(int i = 1; i < n; i++){
            current = current.next;
        }

        newCurrent = current;

        return newCurrent;


    }
}