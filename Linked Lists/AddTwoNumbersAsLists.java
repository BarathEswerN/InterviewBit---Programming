/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    if (a == null) {
	        return b;
	    }
	    if (b == null) {
	        return a;
	    }
	   
	    ListNode res = new ListNode(0);
	    ListNode temp = res;
	    int carry = 0;
	    
	    while (a != null || b != null) {
	        if (a != null) {
	            carry += a.val;
	            a = a.next;
	        }    
	        
	        if (b != null) {
	            carry += b.val;
	            b = b.next;
	        }
	        
	        ListNode sum = new ListNode(carry % 10);
	        temp.next = sum;
	        temp = temp.next;
	        carry /= 10;
	    }
	    
	    if (carry > 0) {
	        ListNode sum = new ListNode(carry % 10);
	        temp.next = sum;
	    }
	    return res.next;
	}
}
