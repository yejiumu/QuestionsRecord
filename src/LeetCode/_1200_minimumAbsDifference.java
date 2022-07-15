package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最小绝对差
 */
public class _1200_minimumAbsDifference {
    /**
     * 执行用时：16 ms, 在所有 Java 提交中击败了99.20%的用户
     * 内存消耗：51.7 MB, 在所有 Java 提交中击败了63.53%的用户
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 首先进行排序，最小差只可能在相邻的两个数产生
        int len = arr.length;
        Arrays.sort(arr);
        // 先默认一个最小差
        int minClash = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        // 遍历
        for (int i = 1; i < len; i++) {
            // 计算相邻元素的差
            int temp = arr[i] - arr[i - 1];
            if (minClash > temp) {
                // 如果有更小的差，进行替换
                minClash = temp;
                // 将列表清空
                ans.clear();
                // 创建一个临时列表
                List<Integer> tmp = new ArrayList<>();
                // 将这相邻元素添加进去
                tmp.add(arr[i - 1]);
                tmp.add(arr[i]);
                // 将该列表加入最终列表中
                ans.add(tmp);
            } else if (minClash == temp) {
                // 如果与最小差相等，直接添加即可
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i - 1]);
                tmp.add(arr[i]);
                ans.add(tmp);
            }
        }
        return ans;
    }
}
