class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 1. Base cases: empty list, 1 node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 2. Find the length of the list and the tail node
        int n = 1; // Start at 1 because we are already looking at the head
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // 3. Connect the tail to the head to form a circular list
        tail.next = head;

        // 4. Calculate how many steps from the head to the new tail
        int r = k % n;
        int stepsToNewTail = n - r - 1; 
        
        ListNode newTail = head;
        while (stepsToNewTail > 0) {
            newTail = newTail.next;
            stepsToNewTail--;
        }

        // 5. The new head is the node right after the new tail
        ListNode newHead = newTail.next;
        
        // 6. Break the circle
        newTail.next = null;

        return newHead;
    }
}