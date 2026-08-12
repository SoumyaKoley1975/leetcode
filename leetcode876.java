// leetcode 876
class Solution {
    public ListNode middleNode(ListNode head) {
        // No dummy node is needed for this problem
        ListNode slow = head;
        ListNode fast = head;

        // Crucial fix: Check both fast and fast.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow now points directly to the middle node
        return slow;
    }
}