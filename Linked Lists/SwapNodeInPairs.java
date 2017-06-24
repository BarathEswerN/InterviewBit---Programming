/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
	    if (head == null || head.next == null) {
	        return head;
	    }
	    
	    ListNode temp1 = null;
	    ListNode temp2 = null;
	    
	    while (head != null && head.next != null) {
	        if (temp1 != null) {
	            temp1.next.next = head.next;
	        }
	        temp1 = head.next;
	        head.next = head.next.next;
	        temp1.next = head;
	        if (temp2 == null) {
	            temp2 = temp1;
	        }
	        head = head.next;
	    }
	    
	    return temp2;
	}
}
