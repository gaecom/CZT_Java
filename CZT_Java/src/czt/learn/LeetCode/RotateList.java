package czt.learn.LeetCode;

import czt.learn.LeetCode.resources.ListNode;

public class RotateList {
	
    public static ListNode reverse(ListNode head) {
          	
    	ListNode preNode = null;
    	ListNode currNode = head;
    	ListNode resHead = null;
    	
    	while (currNode != null) {
    		ListNode tempNode = currNode.next;
    		currNode.next = preNode;
    		preNode = currNode;
    		resHead = currNode;
    		
    		if (tempNode != null) {
    			currNode = tempNode;
    		}
    		else {
    			break;
    		}
    	}
    	return resHead;
    }
    
    // ???

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = ListNode.createListNode(new int[]{1,2,3,4,5}).next;
		ListNode.showListNode(head);
		
		ListNode rotateHead = RotateList.reverse(head);
		ListNode.showListNode(rotateHead);
	}

}