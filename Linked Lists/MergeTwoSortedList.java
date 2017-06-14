/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    if (a == null) {
	        return b;
	    }
	    if (b == null) {
	        return a;
	    }
	    
	    ListNode res = new ListNode(0);
	    ListNode temp = res;
	    
	    while (a != null && b != null) {
	        if (a.val <= b.val) {
	            temp.next = a;
	            a = a.next;
	        }
	        
	        else {
	            temp.next = b;
	            b = b.next;
	        }
	        temp = temp.next;
	    }
	    
	    if (a != null) {
	        temp.next = a;
	    }
	    else if (b != null) {
	        temp.next = b;
	    }
	    
	    return res.next;
	}
}
