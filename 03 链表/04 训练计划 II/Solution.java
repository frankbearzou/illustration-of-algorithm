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
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode cur = head;
        while (cnt-- > 0) {
            cur = cur.next;
        }
        while (cur != null) {
            cur = cur.next;
            head = head.next;
        }
        return head;
    }
}
