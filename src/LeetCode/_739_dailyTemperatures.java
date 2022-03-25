package LeetCode;

import java.util.Arrays;

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
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int t = temperatures[i] + 1; t <= 100; ++t) {
                if (next[t] < warmerIndex) {
                    warmerIndex = next[t];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                ans[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }
        return ans;
    }
}
