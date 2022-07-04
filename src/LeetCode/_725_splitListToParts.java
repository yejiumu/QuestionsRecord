package LeetCode;

/**
 * 分隔链表
 */
public class _725_splitListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        // 统计个数
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        // 每组至少num个，然后将surplus分入前surplus个组中
        int num = n / k, surplus = n % k;

        ListNode[] parts = new ListNode[k];
        ListNode curr = head;
        for (int i = 0; i < k && curr != null; i++) {
            // 每组第一个元素进行初始化
            parts[i] = curr;
            // 每个组有多少元素
            int partSize = num + (i < surplus ? 1 : 0);
            // 从1开始，因为0已经初始化了
            for (int j = 1; j < partSize; j++) {
                // 一一进行后移
                curr = curr.next;
            }
            // 断掉连接
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }
        return parts;
    }
}
