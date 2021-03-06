package czt.learn.LeetCode;

import czt.learn.LeetCode.resources.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create two head nodes for each list;
    	ListNode head1 = new ListNode(-1);
        head1.next = l1;
        ListNode head2 = new ListNode(-1);
        head2.next = l2;
        
        // The head node for result;
        ListNode resHead = new ListNode(-1);
        resHead.next = null;
        ListNode copyResHead = resHead;
        
        int carry = 0;
        // The scenario:
        //   the null checking is essential; then the null checking for next node;
        while ((head1 != null && head1.next != null) || (head2 != null && head2.next != null)) {
        	head1 = head1 == null ? null : head1.next;
        	head2 = head2 == null ? null : head2.next;
        	
        	int val1 = 0;
        	int val2 = 0;
        	val1 = head1 == null ? val1 : head1.val;
        	val2 = head2 == null ? val2 : head2.val;
        	
        	int sum = val1 + val2 + carry;
        	int rem = sum % 10;
        	carry = sum / 10;
        	ListNode tempNode = new ListNode(rem);
        	copyResHead.next = tempNode;
        	copyResHead = copyResHead.next;
        }
        
        // The scenario:
        //   carry digit is non-zero;
        if (carry != 0) {
        	ListNode tempNode = new ListNode(carry);
        	copyResHead.next = tempNode;
        	copyResHead = copyResHead.next;
        }
        
        return resHead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = ListNode.createListNode(new int[]{9, 1, 6}).next;
		ListNode l2 = ListNode.createListNode(new int[]{0}).next;
		ListNode.showListNode(AddTwoNumbers.addTwoNumbers(l1, l2));
	}

}
