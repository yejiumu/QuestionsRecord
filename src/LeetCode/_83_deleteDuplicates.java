package LeetCode;

/**
 * 删除排序链表中的重复元素
 */
public class _83_deleteDuplicates {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了8.34%的用户
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ans = new ListNode(0, head);
        ListNode temp = ans.next;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}
