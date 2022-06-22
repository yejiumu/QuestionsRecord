package LeetCode;

import java.util.Arrays;

/**
 * 高度检查器
 */
public class _1051_heightChecker {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了81.41%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了65.10%的用户
     */
//    public int heightChecker(int[] heights) {
//        int len = heights.length;
//        int ans = 0;
//        // 创建一个副本，进行排序
//        int[] temp = Arrays.copyOf(heights, len);
//        Arrays.sort(temp);
//        // 一一对比两个数组的数值
//        for (int i = 0; i < len; i++) {
//            if (temp[i] != heights[i]) {
//                // 如果不相等，ans自增
//                ans++;
//            }
//        }
//        return ans;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了89.16%的用户
     */
    public int heightChecker(int[] heights) {
        // 因为数据范围的原因，直接创建最大范围的数值
        int[] arr = new int[101];
        // 对数组中的数值计数
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            // 将某数值的个数递减
            while (arr[i]-- > 0) {
                if (heights[j++] != i) {
                    // 如果当前位置不是该数值，count++
                    count++;
                }
            }
        }
        return count;
    }
}
