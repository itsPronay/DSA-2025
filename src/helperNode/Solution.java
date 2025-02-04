package helperNode;

import java.util.List;

// public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode nodeOne = list1;
        ListNode nodeTwo = list2;

        ListNode newHead = new ListNode();
        ListNode newIterator = newHead;


        while (nodeOne.next != null && nodeTwo.next != null) {

            while (nodeOne.val < nodeTwo.val) {
                newIterator.next = nodeOne;
                newIterator = newIterator.next;
                nodeOne = nodeOne.next;
            }

            while (nodeTwo.val <= nodeOne.val) {
                newIterator.next = nodeTwo;
                newIterator = newIterator.next;
                nodeTwo = nodeTwo.next;
            }
        }

        while (nodeOne.next != null) {
            newIterator.next = nodeOne;
            newIterator = newIterator.next;
            nodeOne = nodeOne.next;
        }

        while (nodeTwo.next != null) {
            newIterator.next = nodeTwo;
            newIterator = newIterator.next;
            nodeTwo = nodeTwo.next;
        }

        return newHead.next;
    }

}

