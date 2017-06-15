/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    if (a == null || a.next == null) {
	        return a;
	    }
	    
	    ListNode prev = new ListNode(0);
	    prev.next = a;
	    ListNode temp = prev;
	    
	    while(temp.next != null && temp.next.next != null) {
	        if (temp.next.val == temp.next.next.val) {
	            int val = temp.next.val;
	            while (temp.next != null && temp.next.val == val) {
	                temp.next = temp.next.next;
	            }
	        }
	        else {
	            temp = temp.next;
	        }
	    }
	    return prev.next;
	}
}
