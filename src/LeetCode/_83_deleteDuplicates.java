package LeetCode;

/**
 * 删除排序链表中的重复元素
 */
public class _83_deleteDuplicates {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了35.57%的用户
     */
    public ListNode deleteDuplicates(ListNode head) {
        //如果链表为空或者只有一个元素，直接返回该链表即可
        if (head == null || head.next == null) {
            return head;
        }
        //创建临时变量
        ListNode temp = head;
        //如果后一位不为空，则进入循环
        while (temp.next != null) {
            //如果目前位置的值与下一个位置的值相等
            if (temp.val == temp.next.val) {
                //直接跳过下一元素，进行删除
                temp.next = temp.next.next;
                continue;
            }
            //如果没有相等，则进行后移
            temp = temp.next;
        }
        //直接返回head即可
        return head;
    }
}
