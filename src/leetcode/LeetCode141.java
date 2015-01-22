package leetcode;

public class LeetCode141 {
	public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
        	return false;
        } else {
        	ListNode p1 = head;
        	ListNode p2 = head.next;
        	while (p1 != null && p2 != null) {
        		if( p1.val == p2.val) {
        			return true;
        		}
        		p1 = p1.next;
        		if(p2.next == null) {
        			return false;
        		} else {
        			p2 = p2.next.next;
        		}     		      		
        	}
        	return false;
        }
    }
	
	public static void main() {
		
	}

}
