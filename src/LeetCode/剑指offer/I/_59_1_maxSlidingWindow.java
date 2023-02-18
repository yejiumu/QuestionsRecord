package LeetCode.剑指offer.I;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口的最大值
 *
 * @author jiumu
 * @date 2023/2/18
 */
public class _59_1_maxSlidingWindow {
    /**
     * 执行用时：27 ms, 在所有 Java 提交中击败了90.28%的用户
     * 内存消耗：57 MB, 在所有 Java 提交中击败了84.28%的用户
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        // 构造单调递增队列
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekFirst()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] res = new int[len - k + 1];
        res[0] = nums[deque.peekFirst()];
        for (int i = k; i < len; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        return res;
    }
}
