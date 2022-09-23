package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序链表
 *
 * @author xoke
 * @date 2022/9/23
 */
public class _148_sortList {
    /**
     * 执行用时：13 ms, 在所有 Java 提交中击败了35.32%的用户
     * 内存消耗：50.3 MB, 在所有 Java 提交中击败了23.06%的用户
     * <p>
     * 目前完成不了题目要求
     */
    public ListNode sortList(ListNode head) {
        // 创建一个列表进行存储结点中的数字
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        // 遍历存储
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        // 排序
        Collections.sort(list);
        temp = head;
        // 再重新赋值
        for (int num : list) {
            temp.val = num;
            temp = temp.next;
        }
        // 最后返回头结点
        return head;
    }
}
