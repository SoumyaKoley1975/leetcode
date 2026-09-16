// leetcode solution 148

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Count the length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Dummy node to handle head updates easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Iterate for step sizes 1, 2, 4, 8, ...
        for (int step = 1; step < length; step *= 2) {
            ListNode tail = dummy;
            curr = dummy.next; // Remaining list to be sorted

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, step);
                curr = split(right, step);

                // Merge left and right halves
                tail.next = merge(left, right);
                
                // Move tail to the end of the merged sublist
                while (tail.next != null) {
                    tail = tail.next;
                }
            }
        }

        return dummy.next;
    }

    // Split the list after 'step' nodes and return the second head
    private ListNode split(ListNode head, int step) {
        if (head == null) return null;
        for (int i = 1; i < step && head.next != null; i++) {
            head = head.next;
        }
        ListNode second = head.next;
        head.next = null; // Break the link
        return second;
    }

    // Merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        
        return dummyHead.next;
    }
}
