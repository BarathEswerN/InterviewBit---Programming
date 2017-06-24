/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode a, int b) {
	    if (a == null) {
	        return a;
	    }
	    
	    ListNode curr = new ListNode(0);
	    ListNode greatHead = curr;
	    ListNode temp = new ListNode(0);
	    ListNode newHead = temp;
	    
	    while (a != null) {
	        if (a.val < b) {
	            temp.next = a;
	            temp = temp.next;
	        }
	        else {
	            curr.next = a;
	            curr = curr.next;
	        }
	        a = a.next;
	    }
	    temp.next = null;
	    curr.next = null;
	    newHead = newHead.next;
	    greatHead = greatHead.next;
	    
	    ListNode res = newHead;
	   
	    while (newHead != null && newHead.next != null) {
	        newHead = newHead.next;
	    }
	    if (newHead != null)
	        newHead.next = greatHead;
	    
	    return newHead != null ? res : greatHead;
	    
	}
}
