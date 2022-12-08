package LeetCode.CodeCarl.monotonicStack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 每日温度
 *
 * @author xoke
 * @date 2022/12/8
 */
public class _739_dailyTemperatures {
    /**
     * 执行用时：31 ms, 在所有 Java 提交中击败了52.63%的用户
     * 内存消耗：57.1 MB, 在所有 Java 提交中击败了18.46%的用户
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            // 单调栈
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
