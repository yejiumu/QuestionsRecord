package LeetCode;

/**
 * 旋转链表
 */
public class _61_rotateRight {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了50.50%的用户
     */
    public ListNode rotateRight(ListNode head, int k) {
        // 判空等不合法条件
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        // 统计节点个数
        int n = 1;
        ListNode iter = head;
        while (iter.next != null) {
            iter = iter.next;
            n++;
        }
        // 实际旋转次数
        int add = n - k % n;
        // 无需旋转，直接返回
        if (add == n) {
            return head;
        }
        iter.next = head;
        while (add-- > 0) {
            iter = iter.next;
        }
        ListNode ret = iter.next;
        iter.next = null;
        return ret;
    }
}
