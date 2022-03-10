package LeetCode;

/**
 * 环形链表
 */
public class _141_hasCycle {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.4 MB, 在所有 Java 提交中击败了29.27%的用户
     */
    public boolean hasCycle(ListNode head) {
        //如果原链表为空或者只有一个元素，直接返回false
        if (head == null || head.next == null) {
            return false;
        }
        //创建快慢双指针
        ListNode fast = head.next;
        ListNode slow = head;
        //只有当两个指针不相等的时候才进入循环
        while (slow != fast) {
            //如果快指针为空或者下一位为空，则说明该链表不为循环，直接返回false
            if (fast == null || fast.next == null) {
                return false;
            }
            //然后slow后移，fast后移两位，保证如果有循环一定能相遇
            slow = slow.next;
            fast = fast.next.next;
        }
        //如果前面都通过，直到slow == fast，说明有循环，直接返回true
        return true;
    }
}
