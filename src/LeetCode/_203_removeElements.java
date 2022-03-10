package LeetCode;

/**
 * 移除链表元素
 */
public class _203_removeElements {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了33.00%的用户
     */
    public ListNode removeElements(ListNode head, int val) {
        //如果原链表为空，直接返回null
        if (head == null) {
            return null;
        }
        //创建头结点的前一个结点
        ListNode ans = new ListNode(0, head);
        //创建临时结点
        ListNode temp = ans;
        //判断temp.next是否为空
        while (temp.next != null) {
            //如果temp.next的值等于指定的值
            if (temp.next.val == val) {
                //跳过该节点
                temp.next = temp.next.next;
                continue;
            }
            //如果不等于指定的值，temp后移
            temp = temp.next;
        }
        //返回头结点前一个结点的后一个结点
        return ans.next;
    }
}