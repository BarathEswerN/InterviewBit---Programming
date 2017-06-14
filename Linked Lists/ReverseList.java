/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseList(ListNode a) {
	    if (a == null || a.next == null) {
	        return a;
	    }
	    
	    ListNode prev = null;
	    ListNode curr = a;
	    
	    while (curr != null) {
	        ListNode nxt = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nxt;
	    }
	    
	    return prev;
	}
}
