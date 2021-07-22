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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(-1, head);
        ListNode lNode = dummyHead;
        ListNode rNode = lNode.next;
        for (int i = 0; i < left - 1; i++) {
            lNode = lNode.next; rNode = rNode.next;
        }
//         删除节点到lNode
        for (int i = 0; i < right - left; i++) {
            ListNode delNode = rNode.next;
            rNode.next = delNode.next;
            delNode.next = lNode.next;
            lNode.next = delNode;
        }
        return dummyHead.next;
    }
}