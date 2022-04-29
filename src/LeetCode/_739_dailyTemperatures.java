package LeetCode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 每日温度
 */
public class _739_dailyTemperatures {
    /**
     * 执行用时：1819 ms, 在所有 Java 提交中击败了5.03%的用户
     * 内存消耗：50.4 MB, 在所有 Java 提交中击败了79.40%的用户
     *
     * 不知为何，如此之慢
     */
//    public int[] dailyTemperatures(int[] temperatures) {
//        int len = temperatures.length;
//        int[] res = new int[len];
//        boolean isFirst = false;
//        for (int i = 0; i < len; i++) {
//            int max = temperatures[i];
//            for (int j = i + 1; j < len; j++) {
//                if (temperatures[j] > max) {
//                    res[i] = j - i;
//                    isFirst = true;
//                    break;
//                }
//                if (j == len - 1 && !isFirst) {
//                    res[i] = 0;
//                }
//                isFirst = false;
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：40 ms, 在所有 Java 提交中击败了52.07%的用户
     * 内存消耗：55 MB, 在所有 Java 提交中击败了20.76%的用户
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        // 最多不过100的温度
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        // 从后往前遍历数组
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            // 从当前温度开始，向100遍历寻找是否有大于当前温度的下标
            for (int t = temperatures[i] + 1; t <= 100; ++t) {
                // 找到了
                if (next[t] < warmerIndex) {
                    // 更新临时下标
                    warmerIndex = next[t];
                }
            }
            // 找到了
            if (warmerIndex < Integer.MAX_VALUE) {
                // 更新结果数组中的值，温度更高的下标减去当前下标
                ans[i] = warmerIndex - i;
            }
            // 将温度的下标加入next数组中
            next[temperatures[i]] = i;
        }
        return ans;
    }
    /**
     * 有更好的，不过我还没搞懂
     */
}
