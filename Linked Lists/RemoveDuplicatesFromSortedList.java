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
	    if (a == null|| a.next == null) {
	        return a;
	    }
	    
	    ListNode res = a;
	    
	    while (a != null && a.next !=  null) {
	        if (a.val == a.next.val) {
	            int val = a.val;
	            ListNode temp = a;
	            while (temp != null && temp.val == val) {
	                temp = temp.next;
	            }
	            a.next = temp;
	        }
	       
	       a = a.next;
	        
	    } 
	    
	    return res;
	}
}
