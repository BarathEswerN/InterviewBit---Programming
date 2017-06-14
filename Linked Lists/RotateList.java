/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
	    if (a == null) {
	        return a;
	    }
	    
	    int length = 0;
	    ListNode temp = a;
	    
	    while (temp != null) {
	        temp = temp.next;
	        length++;
	    }
	    
	    b = b % length;
	    if (b == 0) {
	        return a;
	    }
	    
	    int k = length - b;
	    temp = a;
	    
	    while (k > 1) {
	        temp = temp.next;
	        k--;
	    }
	    
	    ListNode newHead = temp.next;
	    
	    temp.next = null;
	    temp = newHead;
	    
	    while (temp != null && temp.next != null) {
	        temp = temp.next;
	    }
	    
	    temp.next = a;
	    
	    return newHead;
	    
	}
}
