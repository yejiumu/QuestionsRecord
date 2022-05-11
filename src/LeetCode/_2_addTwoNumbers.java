package LeetCode;

/**
 * 两数相加
 */
public class _2_addTwoNumbers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了93.80%的用户
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 创建头尾双指针
        ListNode head = null, tail = null;
        // 进位数
        int carry = 0;
        // 直到两个链表都到底，才退出循环
        while (l1 != null || l2 != null) {
            // 取出两个链表中当前位置的值，为空默认为0
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            // 两者之和
            int sum = a + b + carry;
            if (head == null) {
                // 如果是第一个节点，先创建链表
                head = tail = new ListNode(sum % 10);
            } else {
                // 否则继续向后创建链表
                tail.next = new ListNode(sum % 10);
                // 连接上
                tail = tail.next;
            }
            // 进位数
            carry = sum / 10;
            if (l1 != null) {
                // 如果l1不为空，后移
                l1 = l1.next;
            }
            if (l2 != null) {
                // 如果l2不为空，后移
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            // 如果最后进位数不为0，继续向后创建链表
            tail.next = new ListNode(carry);
        }
        // 返回头指针即可
        return head;
    }
}
