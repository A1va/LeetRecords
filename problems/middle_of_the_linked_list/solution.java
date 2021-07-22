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
    public ListNode middleNode(ListNode head) {

        ListNode lNode = head;
        ListNode rNode = head;
        while (rNode != null && rNode.next != null) {
            lNode = lNode.next;
            rNode = rNode.next.next;
        }
        return lNode;
    }
}