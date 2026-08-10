// leetcode problem no.2 solution 

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a dummy node to act as the anchor for our result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry =0;

        // Loops as long as there are digits left in l1 OR L2, or a leftover carry

        while(l1 !=null || l2 !=null || carry != 0){
            int sum = carry; // start with the prevoius carry 

            // Add value from l1 if exisit 
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;// Move to the next digit
            }

            // Add value form the l2
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;// Move to the next digit
            }

            //calculate the new carry 
            carry = sum / 10;

            // Create the node whith the single digit value and attach it 

            current.next = new ListNode (sum % 10);
            current = current.next;// Advanced the pointer
        }
        
        // Return the actual head of the new List
        return dummyHead.next;
    }
}