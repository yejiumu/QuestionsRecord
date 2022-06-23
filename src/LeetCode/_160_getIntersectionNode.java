package LeetCode;

/**
 * 相交链表
 */
public class _160_getIntersectionNode {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.93%的用户
     * 内存消耗：44.3 MB, 在所有 Java 提交中击败了41.85%的用户
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 有一个为空都直接返回空
        if (headA == null || headB == null) {
            return null;
        }
        // 创建双指针
        ListNode la = headA, lb = headB;
        // 各自循环两个链表，直到两指针相同
        while (la != lb) {
            // 本链表为空时，循环另一个链表
            la = la == null ? headB : la.next;
            lb = lb == null ? headA : lb.next;
        }
        // 返回一个指针即可
        return la;
    }
}
