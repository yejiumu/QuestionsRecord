package LeetCode;

/**
 * 二进制链表转整数
 */
public class _1290_getDecimalValue {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了31.45%的用户
     */
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        //判断链表当前位置是否为空
        while (head != null) {
            //不为空，添加进str中
            str.append(head.val);
            //并将链表后移
            head = head.next;
        }
        //直接返回字符串以2进制转化后的数值
        return Integer.parseInt(str.toString(), 2);
    }
}
