package LeetCode.CodeCarl.list;

import LeetCode.ListNode;

/**
 * 两两交换链表中的节点
 *
 * @author xoke
 * @date 2022/10/24
 */
public class _24_swapPairs {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了5.30%的用户
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0, head);
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            // 缓存 next
            ListNode temp = head.next.next;
            // 将 prev 的 next 改为 head 的 next
            cur.next = head.next;
            // 将 head.next(pre.next) 的next，指向 head
            head.next.next = head;
            // 将head 的 next 接上缓存的temp
            head.next = temp;
            // 前进1位
            cur = head;
            // 前进1位
            head = head.next;
        }
        return pre.next;
    }
}
