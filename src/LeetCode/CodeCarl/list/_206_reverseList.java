package LeetCode.CodeCarl.list;

import LeetCode.ListNode;

/**
 * 反转链表
 *
 * @author xoke
 * @date 2022/10/23
 */
public class _206_reverseList {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了65.31%的用户
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 创建指针指向头结点
        ListNode res = head;
        while (head.next != null) {
            // 将head的next结点赋值给此时指针的前一位
            res = new ListNode(head.next.val, res);
            // 将head的下一结点删除
            head.next = head.next.next;
        }
        return res;
    }
}
