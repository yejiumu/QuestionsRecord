package LeetCode.剑指offer.I;

import LeetCode.ListNode;

/**
 * 删除链表的节点
 *
 * @author xoke
 * @date 2022/8/21
 */
public class _18_deleteNode {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了64.28%的用户
     */
    public ListNode deleteNode(ListNode head, int val) {
        // 考虑值在头结点的情况
        if (head.val == val) {
            return head.next;
        }
        // 用双指针来删除当前结点
        ListNode pre = head, cur = head.next;
        // 逐一后移，找到或者到最后了就退出循环
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        // 如果不为null，那就是找到了，进行删除操作
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }
}
