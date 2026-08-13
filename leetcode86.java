// leetcode 86 partition problem 

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
    public ListNode partition(ListNode head, int x) {
        // step 1: Create a dummy nodes to act as safe starting anchors 
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        // Pointers to track the moving end of both chains 

        ListNode less = lessHead;
        ListNode greater = greaterHead;

        ListNode curr = head;

        // step 2 : Distributes node into seperate chains 

        while( curr != null){
            if ( curr.val < x){
                less.next = curr;
                less = less.next;
            }else{
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }
        // step 3: cut off the tail of the greater chain 
        greater.next = null;

        // step 4: connect the less chain to the greater chain 

        less.next = greaterHead.next;

        // Return the actual head of the reordered list

        return lessHead.next;




    }
}