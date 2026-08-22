// leetcode 206 java solution 
// reverse of linked list 

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // Tracks the previous node
        ListNode curr = head;   // Tracks the current node
        ListNode next = null;   // Temporarily tracks the next node
        
        while (curr != null) {
            next = curr.next;   // 1. Save the next node
            curr.next = prev;   // 2. Reverse the link (current points to previous)
            prev = curr;        // 3. Move prev one step forward
            curr = next;        // 4. Move curr one step forward
        }
        
        return prev;            // prev becomes the new head of the reversed list
        
    }
}