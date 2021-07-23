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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1, head);
        ListNode pre = dummyHead;
        while (pre != null && pre.next != null) {
            if (val == pre.next.val) {
//                 修改链表
                pre.next = pre.next.next;
            }else {
//                 遍历
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }
}