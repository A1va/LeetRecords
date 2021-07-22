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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1, head);
        ListNode lNode = dummyHead;
        ListNode rNode = dummyHead;
//         n+1 times
        for (; n >= 0; n--) {
            rNode = rNode.next;
        }
//         lNode: 倒数第n+1个节点
        while (rNode != null) {
            lNode = lNode.next;
            rNode = rNode.next;
        }
//         删除lNode下一个
        ListNode delNode = lNode.next;
        lNode.next = delNode.next;
        return dummyHead.next;
    }
}