package LeetCode.CodeCarl.list;

import LeetCode.ListNode;

/**
 * 删除链表的倒数第 N 个结点
 *
 * @author xoke
 * @date 2022/10/24
 */
public class _19_removeNthFromEnd {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了99.83%的用户
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLen(head);
        ListNode pre = new ListNode(0, head);
        ListNode temp = pre;
        for (int i = 0; i <= len - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return pre.next;
    }

    // 求链表长度
    public int getLen(ListNode head) {
        int len = 1;
        while (head.next != null) {
            head = head.next;
            ++len;
        }
        return len;
    }
}
