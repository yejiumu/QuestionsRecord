package LeetCode.剑指offer.I;

import LeetCode.ListNode;

/**
 * 反转链表
 *
 * @author xoke
 * @date 2022/8/10
 */
public class _24_reverseList {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了29.94%的用户
     */
    public ListNode reverseList(ListNode head) {
        // 双指针交换进行替换
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            // 创建临时结点，存储当前结点的后继结点
            ListNode temp = cur.next;
            // 修改引用指向
            cur.next = pre;
            // 存储当前结点
            pre = cur;
            // 访问下一结点
            cur = temp;
        }
        return pre;
    }
}
