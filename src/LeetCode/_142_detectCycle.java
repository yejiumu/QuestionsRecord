package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表 II
 *
 * @author xoke
 * @date 2022/7/25
 */
public class _142_detectCycle {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了20.25%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了16.05%的用户
     */
    public ListNode _detectCycle(ListNode head) {
        ListNode temp = head;
        // 直接用set集合，出现重复的直接返回该结点
        Set<ListNode> set = new HashSet<>();
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            } else {
                set.add(temp);
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了85.62%的用户
     */
    public ListNode detectCycle(ListNode head) {
        // head为空，直接返回
        if (head == null) {
            return null;
        }
        ListNode fast = head, slow = head;
        // 只要快指针不为空，就一直循环
        while (fast != null) {
            // 慢指针后移一位
            slow = slow.next;
            // 如果快指针后面一位不为空
            if (fast.next != null) {
                // 快指针后移两位
                fast = fast.next.next;
            } else {
                // 否则直接返回空
                return null;
            }
            // 下面是最重要的部分
            // 假设链表中环外部分的长度为a
            // slow指针进入环后，又走了b的距离与fast相遇
            // 此时，fast指针已经走完了环的n圈
            // 因此它走过的总距离为 a+n(b+c)+b=a+(n+1)b+nc
            // 当快慢指针相遇，且快指针是慢指针的2倍距离
            // a+(n+1)b+nc=2(a+b)⟹a=c+(n−1)(b+c)
            // 得出从相遇点到入环点的距离加上n−1圈的环长，恰好等于从链表头部到入环点的距离。
            if (fast == slow) {
                ListNode pre = head;
                while (pre != slow) {
                    pre = pre.next;
                    slow = slow.next;
                }
                return pre;
            }
        }
        return null;
    }
}
