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
        //如果head为空或者只有一个元素，直接返回head
        if (head == null || head.next == null) {
            return head;
        }
        //创建另一个指针指向head
        ListNode ans = head;
        //如果head。next不为空
        while (head.next != null) {
            //创建临时结点
            ListNode temp = new ListNode(head.next.val);
            //删除head的下一个结点
            head.next = head.next.next;
            //将临时结点，赋给ans的前一个结点，利用好构造器
            ans = new ListNode(temp.val, ans);
        }
        //直接返回ans
        return ans;
    }
}
