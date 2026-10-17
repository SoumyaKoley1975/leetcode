// leetcode solution in java 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(val) { this.val = val; }
 *     ListNode(val, next) { this.val = next; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Dummy node to handle edge cases where left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 1. Move 'prev' to the node just before 'left'
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // 2. 'start' is the first node of the sublist to reverse
        // 'curr' will be used to reverse the links
        ListNode start = prev.next;
        ListNode curr = start.next;

        // 3. Reverse the sublist from 'left' to 'right'
        for (int i = 0; i < right - left; i++) {
            start.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = start.next;
        }

        return dummy.next;
    }
}
// soumya