package solutions;

import helperNode.ListNode;

import java.util.List;

// https://neetcode.io/problems/reverse-a-linked-list

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        return prev;
    }
}
