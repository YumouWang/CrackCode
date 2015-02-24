package leetcode;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) {
    		return null;
    	}
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA; 
        ListNode tempB = headB;
        
        while (tempA != null) {
        	lengthA++;
        	tempA = tempA.next;
        }
        
        while (tempB != null) {
        	lengthB++;
        	tempB = tempB.next;
        }
        
        if (lengthA == lengthB) {
        	
        } else if (lengthA > lengthB) {
        	int diff = lengthA - lengthB;
        	while (diff > 0) {
        		headA = headA.next;
        		diff--;
        	}       	
        } else {
        	int diff = lengthB - lengthA;
        	while (diff > 0) {
        		headB = headB.next;
        		diff--;
        	}
        }
        while (headA != null && headB != null) {
    		if (headA.val == headB.val) {
    			return headA;
    		}
    		headA = headA.next;
    		headB = headB.next;
    	}
        return null;
    }
    
    public static void main(String[] args) {
    	
    }

}
