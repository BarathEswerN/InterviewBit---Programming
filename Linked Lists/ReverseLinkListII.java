/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverse(ListNode a) {
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
    
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    ListNode temp1 = null;
	    if (m > 1) {
	        temp1 = a;
	    }
	    ListNode temp2 = a;
	    
	    while(m > 2) {
	        temp1 = temp1.next;
	        m--;
	    } 
	    
	    while (n > 1) {
	        temp2 = temp2.next;
	        n--;
	    }
	    
	    ListNode newHead = a;
	    if (temp1 != null) {
	        newHead = temp1.next;
	        temp1.next = null;
	    }
	    
	    ListNode tail = temp2.next;
	    temp2.next = null;
	    
	    newHead = reverse(newHead);
	    if (temp1 != null)
	        temp1.next = newHead;
	    else
	        a = newHead;
	    temp1 = newHead;
	    while (temp1 != null && temp1.next != null) {
	        temp1 = temp1.next;
	    }
	    
	    temp1.next = tail;
	    
	    return a;
	    
	}
}
