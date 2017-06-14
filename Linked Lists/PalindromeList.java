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
    
    public int lPalin(ListNode A) {
        if (A == null || A.next == null) {
            return 1;
        }
        
        ListNode temp1 = A;
        ListNode temp2 = A;
        
        while (temp1.next != null && temp1.next.next != null) {
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        
        ListNode newHead = temp2.next;
        newHead = reverse(newHead);
        temp2.next =  null;
        
        while (A != null && newHead != null) {
            if (A.val != newHead.val) {
                return 0;
            }
            A = A.next;
            newHead = newHead.next;
        }
        
        return 1;
    }
}
