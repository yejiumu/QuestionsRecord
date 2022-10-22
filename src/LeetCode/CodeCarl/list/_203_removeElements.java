package LeetCode.CodeCarl.list;

import LeetCode.ListNode;

/**
 * 移除链表元素
 *
 * @author xoke
 * @date 2022/10/22
 */
public class _203_removeElements {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了52.78%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了91.56%的用户
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0, head);
        ListNode temp = pre;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return pre.next;
    }
}
