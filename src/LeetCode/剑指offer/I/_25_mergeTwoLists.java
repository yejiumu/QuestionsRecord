package LeetCode.剑指offer.I;

import LeetCode.ListNode;

/**
 * 合并两个排序的链表
 *
 * @author xoke
 * @date 2022/8/18
 */
public class _25_mergeTwoLists {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了17.97%的用户
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 创建临时链表，存储两链表合并
        ListNode temp = new ListNode();
        // 创建合并链表的头指针
        ListNode ans = temp;
        // 进行遍历，一旦有一个到底了，直接退出循环
        while (l1 != null && l2 != null) {
            // 先将小的加入合并链表中
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            // 链表后移
            temp = temp.next;
        }
        // 将不为空的全部加入链表中
        if (l1 == null) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }
        // 返回原来的temp链表即可
        return ans.next;
    }
}
