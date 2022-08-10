package LeetCode.剑指offer.I;

import LeetCode.ListNode;

/**
 * 从尾到头打印链表
 *
 * @author xoke
 * @date 2022/8/10
 */
public class _6_reversePrint {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了59.28%的用户
     */
    public int[] reversePrint(ListNode head) {
        // 先遍历统计链表长度
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            ++count;
            temp = temp.next;
        }
        // 然后倒序赋值数组
        int[] ans = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            ans[i] = head.val;
            head = head.next;
        }
        return ans;
    }
}
