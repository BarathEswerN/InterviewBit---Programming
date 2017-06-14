/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    
	    if (a == null) {
	        return null;
	    }
	    
	    ListNode temp1 = a;
	    ListNode temp2 = a;
	    
	    for (int i = 0; i < b; i++) {
	        if (temp1 == null) {
	            break;
	        }
	        temp1 = temp1.next;
	    }
	    
	    if (temp1 == null) {
	        return a.next;
	    }
	    
	    while (temp1.next != null) {
	        temp1 = temp1.next;
	        temp2 = temp2.next;
	    }
	    
	    if (temp2.next != null)
	        temp2.next = temp2.next.next;
	        
	    return a;
	}
}
