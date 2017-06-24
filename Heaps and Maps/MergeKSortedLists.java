/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    if (a == null || a.size() < 1) {
	        return null;
	    }
	    
	    PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
	        public int compare(ListNode l1, ListNode l2) {
	            return l1.val - l2.val;
	        }
	        
	    });
	    ListNode head = new ListNode(0);
	    
	    for (int i = 0; i < a.size(); i++) {
	        pq.offer(a.get(i));
	    }
	    
	    ListNode temp = head;
	    
	    while (!pq.isEmpty()) {
	        ListNode pop = pq.poll();
	        temp.next = pop;
	        temp = temp.next;
	        if (pop.next != null) {
	            pq.offer(pop.next);
	        }
	    }
	    
	    return head.next;
	}
}
