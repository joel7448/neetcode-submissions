/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return null;
        }
        ListNode newHead = head;

        if(head.next != null)
        {
            newHead = reverseList(head.next);
            head.next.next = head; // 3 --> 2 ----> 1 ---> 0
        }

        head.next = null;
        return newHead; // 3 ---> null

    }
}
