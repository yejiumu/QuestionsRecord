package LeetCode.剑指offer.I;

import LeetCode.ListNode;

/**
 * 两个链表的第一个公共节点
 *
 * @author xoke
 * @date 2022/8/23
 */
public class _52_getIntersectionNode {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.53%的用户
     * 内存消耗：44.5 MB, 在所有 Java 提交中击败了33.00%的用户
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 先判空
        if (headA == null || headB == null) {
            return null;
        }
        // 创建双指针
        ListNode la = headA, lb = headB;
        // 循环直到两指针相等：都为空或者找到公共结点
        while (la != lb) {
            // 如果本链表为空，转到另一个链表继续循环
            la = la == null ? headB : la.next;
            lb = lb == null ? headA : lb.next;
        }
        // 返回其中一个即可
        return la;
    }
}
