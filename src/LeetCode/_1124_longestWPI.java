package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 表现良好的最长时间段
 *
 * @author jiumu
 * @date 2023/2/14
 */
public class _1124_longestWPI {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了81.75%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了28.00%的用户
     */
    public int longestWPI(int[] hours) {
        // 解析：https://leetcode.cn/problems/longest-well-performing-interval/solution/can-kao-liao-ji-ge-da-shen-de-ti-jie-zhi-hou-zong-/
        int len = hours.length;
        int[] arr = new int[len + 1];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i <= len; i++) {
            arr[i] = arr[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (arr[stack.peek()] > arr[i]) {
                stack.push(i);
            }
        }
        int res = 0;
        for (int i = len; i >= 1; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res = Math.max(res, i - stack.pop());
            }
        }
        return res;
    }
}
