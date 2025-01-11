package solutions;

import helperNode.ListNode;

// https://neetcode.io/problems/merge-two-sorted-linked-lists

public class MergeTwoSortedLinedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode nodeOne = list1;
        ListNode nodeTwo = list2;

        ListNode newHead = new ListNode();
        ListNode newIterator = newHead;


        while (nodeOne != null && nodeTwo != null) {

            if (nodeOne.val < nodeTwo.val) {
                newIterator.next = nodeOne;
                nodeOne = nodeOne.next;
            } else {
                newIterator.next = nodeTwo;
                nodeTwo = nodeTwo.next;
            }

            newIterator = newIterator.next;

        }

        while (nodeOne != null) {
            newIterator.next = nodeOne;
            newIterator = newIterator.next;
            nodeOne = nodeOne.next;
        }

        while (nodeTwo != null) {
            newIterator.next = nodeTwo;
            newIterator = newIterator.next;
            nodeTwo = nodeTwo.next;
        }

        return newHead.next;
    }
}
