package LeetCode.CodeCarl.list;

import LeetCode.ListNode;

/**
 * 链表相交
 *
 * @author xoke
 * @date 2022/10/25
 */
public class _160_getIntersectionNode {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.60%的用户
     * 内存消耗：44.9 MB, 在所有 Java 提交中击败了5.04%的用户
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
