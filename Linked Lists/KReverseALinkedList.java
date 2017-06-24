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
    
    public ListNode reverseList(ListNode a, int B) {
        if (a == null || a.next == null) {
            return a;
        }
        
        int k = B;
        ListNode temp = a;
        ListNode rev = null;
        ListNode newHead = null;
        ListNode prevHead = a;
        
        while (temp != null) {
            while (temp != null && k > 1) {
                temp = temp.next;
                k--;
            }
            if (temp == null) {
                break;
            }
            ListNode nxt = temp.next;
            temp.next = null;
            temp = reverse(prevHead);
            prevHead = nxt;
            
            if (newHead == null) {
                newHead = temp;
            }
            else {
                rev.next = temp;
            }
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            temp.next = nxt;
            rev  = temp;
            temp = temp.next;
            k = B;
        }
        
        return newHead;
    }
}
