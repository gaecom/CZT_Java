package czt.learn.LeetCode.resources;

// Definition for singly-linked list.
public class ListNode {
	public int val;
    public ListNode next;
	
    public ListNode(int x) {
		val = x;
		next = null;
	}
    
    public static void showListNode(ListNode head) {
    	ListNode temp = new ListNode(-1);
    	temp.next = head;
    	
    	System.out.print("{");
    	while (temp.next != null) {
    		temp = temp.next;
    		System.out.print(temp.val);
    		if (temp.next != null) {
    			System.out.print(" -> ");
    		}
    	}
    	System.out.print("}");
    }
    
    public static ListNode createListNode(int[] arr) {
    	ListNode head = new ListNode(-1);
    	head.next = null;
    	ListNode anoHead = head;
    	for (int i=0; i<arr.length; ++i) {
    		ListNode tempNode = new ListNode(arr[i]);
    		tempNode.next = null;
    		anoHead.next = tempNode;
    		anoHead = anoHead.next;
    	}
    	return head;
    }
}