/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = null;
         
        while (head != null) {
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
        }
        
        return prev;
    }
	public ListNode reorderList(ListNode a) {
	    if (a == null || a.next == null) {
	        return a;
	    }
	    
	    ListNode slow = a;
	    ListNode fast = a;
	    
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    
	    ListNode newHead = slow.next;
	    slow.next = null;
	    newHead = reverse(newHead);
	    
	    ListNode temp = a;
	    
	    while (temp != null && newHead != null) {
	        ListNode nxt1 = temp.next;
	        temp.next = newHead;
	        ListNode nxt2 = newHead.next;
	        newHead.next = nxt1;
	        temp = nxt1;
	        newHead = nxt2;
	    }
	    
	    return a;
	}
}
