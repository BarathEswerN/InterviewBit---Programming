/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    if (a == null || b== null) {
	        return null;
	    }
	    
	    int count1 = 0;
	    int count2 = 0;
	    
	    ListNode temp = a;
	    
	    while (temp != null) {
	        temp = temp.next;
	        count1++;
	    }
	    temp = b;
	    
	    while (temp != null) {
	        temp = temp.next;
	        count2++;
	    }
	    
	    int diff = 0;
	    boolean isAGreater = false;
	    if (count1 >= count2) {
	        isAGreater = true;
	        diff = count1 - count2;
	    }
	    else {
	        diff = count2 - count1;
	    }
	    
	    ListNode secnd = null;
	    if (isAGreater) {
	        temp = a;
	        secnd = b; 
	    }
	    else {
	        temp = b;
	        secnd = a;
	    }
	    
	    while (diff > 0) {
	        temp = temp.next;
	        diff--;
	    }
	    
	    while (temp != null && secnd != null) {
	        if (temp == secnd) {
	            return temp;
	        }
	        temp = temp.next;
	        secnd = secnd.next;
	    }
	    
	    return null;
	}
}
