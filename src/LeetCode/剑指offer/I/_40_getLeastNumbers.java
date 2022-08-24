package LeetCode.剑指offer.I;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最小的k个数
 *
 * @author xoke
 * @date 2022/8/24
 */
public class _40_getLeastNumbers {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了69.97%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了87.79%的用户
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        // 简单的api调用
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }

    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了36.65%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了16.05%的用户
     */
    public int[] getLeastNumbers_(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        // 利用优先对列的自动排序
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : arr) {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (num < queue.peek()) {
                queue.poll();
                queue.offer(num);
            }
        }
        // 然后依次赋值
        int[] ans = new int[k];
        int index = 0;
        for (int num : queue) {
            ans[index++] = num;
        }
        return ans;
    }
}
