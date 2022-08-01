package LeetCode.剑指offer.II;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 滑动窗口的平均值
 *
 * @author xoke
 * @date 2022/8/1
 */
public class _41_MovingAverage {
    /**
     * 执行用时：36 ms, 在所有 Java 提交中击败了94.37%的用户
     * 内存消耗：45.4 MB, 在所有 Java 提交中击败了82.96%的用户
     */
    class MovingAverage {
        int size;
        int sum;
        // 创建一个对列，方便进行删除添加操作
        Queue<Integer> queue = new ArrayDeque<>();

        // 进行初始化
        public MovingAverage(int size) {
            this.size = size;
            sum = 0;
        }

        public double next(int val) {
            // 先进行添加
            queue.add(val);
            // 总和也先加上
            sum += val;
            // 如果此时对列元素数量大于规定数量
            if (queue.size() > size) {
                // 总和减去对列的第一个元素，并删除第一个元素
                sum -= queue.poll();
            }
            // 返回对列中的平均值
            return sum * 1.0 / queue.size();
        }
    }
}
