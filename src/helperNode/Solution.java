package helperNode;

import java.util.List;

/**
 * this is for leetcode
 */
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75

/**
 * this is for leetcode practise
 */
public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int length = 1;

        // for length 1 ( 2 , 0 )
        // if fist nodes
        if(head.next == null){
            return null;
        }

        ListNode counterNode = head;

        while (counterNode.next != null) {
            length++;
            counterNode = counterNode.next;
        }

        System.out.println(length);
        int middleNode = length / 2, iterator = 0;
        ListNode previous = new ListNode();
        previous = null;

        // for length 2 or 3
        // if first node needs to be deleted
        ListNode newNode = head;
        if(middleNode == 1){
            return newNode.next;
        }

        while (newNode.next != null) {
            if (iterator == middleNode) {
                previous.next = newNode.next;
                return head;
            }
            iterator++;
            previous = newNode;
            newNode = newNode.next;
        }

        return head;
    }
}

