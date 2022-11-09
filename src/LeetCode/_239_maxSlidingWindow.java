package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口最大值
 *
 * @author xoke
 * @date 2022/11/9
 */
@SuppressWarnings("all")
public class _239_maxSlidingWindow {
    // 理论可行，时间复杂度太高通过不了
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int len = nums.length;
//        int[] res = new int[len - k + 1];
//        int rLen = res.length;
//        for (int i = 0; i < rLen; i++) {
//            int max = -0x3f3f3f;
//            for (int j = 0; j < k; j++) {
//                if (nums[i + j] > max) {
//                    max = nums[i + j];
//                }
//            }
//            res[i] = max;
//        }
//        return res;
//    }

    /**
     * 执行用时：41 ms, 在所有 Java 提交中击败了27.36%的用户
     * 内存消耗：57 MB, 在所有 Java 提交中击败了85.26%的用户
     */
    public int[] maxSlidingWindow_(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        int len = nums.length, index = 0;
        int[] res = new int[len - k + 1];
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        res[index++] = myQueue.peek();
        for (int i = k; i < len; i++) {
            myQueue.poll(nums[i - k]);
            myQueue.add(nums[i]);
            res[index++] = myQueue.peek();
        }
        return res;
    }

    /**
     * 执行用时：30 ms, 在所有 Java 提交中击败了61.06%的用户
     * 内存消耗：56.8 MB, 在所有 Java 提交中击败了88.33%的用户
     */
    // 解法二，利用双端队列手动实现单调队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
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

// 解法一，自定义队列
class MyQueue {
    Deque<Integer> deque = new LinkedList<>();

    void poll(int num) {
        if (!deque.isEmpty() && num == deque.peek()) {
            deque.poll();
        }
    }

    void add(int num) {
        while (!deque.isEmpty() && num > deque.getLast()) {
            deque.removeLast();
        }
        deque.add(num);
    }

    int peek() {
        return deque.peek();
    }
}
