package LeetCode;

/**
 * 删除链表的倒数第 N 个结点
 */
public class _19_removeNthFromEnd {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了66.39%的用户
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLen(head);
        ListNode temp = new ListNode(0, head);
        ListNode tmp = temp;
        for (int i = 0; i < len - n; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return temp.next;
    }

    public int getLen(ListNode head) {
        int len = 1;
        while (head.next != null) {
            ++len;
            head = head.next;
        }
        return len;
    }
}
