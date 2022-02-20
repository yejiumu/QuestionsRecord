package LeetCode;

/**
 * 反转链表
 */
public class _206_reverseList {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了59.79%的用户
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ans = head;
        while (head.next != null) {
            ListNode temp = new ListNode(head.next.val);
            head.next = head.next.next;
            ans = new ListNode(temp.val, ans);
        }
        return ans;
    }
}
