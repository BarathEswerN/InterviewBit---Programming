/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    if (a == null || a.next == null) {
	        return null;
	    }
	    
	    ListNode fast = a;
	    ListNode slow = a;
	    boolean hasCycle = false;
	    
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        
	        if (fast == slow) {
	            hasCycle = true;
	            break;
	        }
	    }
	    
	    if (!hasCycle) {
	        return null;
	    }
	    
	    slow = a;
	    
	    while (fast != slow) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    
	    return fast;
	}
}
