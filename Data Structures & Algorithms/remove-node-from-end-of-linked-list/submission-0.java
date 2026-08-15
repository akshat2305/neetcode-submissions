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
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode first = dummy;
    ListNode second = dummy;

    // Move first n+1 steps ahead (extra step accounts for starting at dummy, not head)
    for (int i = 0; i < n + 1; i++) {
        first = first.next;
    }

    // Move both together until first reaches the end
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    // second is now at the node just before the target — skip over it
    second.next = second.next.next;

    return dummy.next;
}
}
