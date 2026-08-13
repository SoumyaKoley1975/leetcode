// leetdoe 141
// linked list cycle problem

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode dummy = head;
        ListNode fast = head;
        if ( dummy == null || dummy.next == null){
        return false;
        }

        while(fast != null && fast.next != null){
            dummy = dummy.next;
            fast = fast.next.next;
            if(dummy == fast){
                return true;
            }
        }
        return false;
    }
}