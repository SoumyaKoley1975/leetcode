// leetcode 203 solution


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node and link it to the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Use top as a tracking pointer starting at the dummy node
        ListNode top = dummy;
        
        while (top != null && top.next != null) {
            if (top.next.val == val) {
                // Bypass the node with the matching value
                top.next = top.next.next;
            } else {
                // Only advance if we didn't delete a node
                top = top.next;
            }
        }
        
        // Return the actual head of the modified list
        return dummy.next;
    }
}
