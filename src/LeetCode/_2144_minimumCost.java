package LeetCode;

import java.util.Arrays;

public class _2144_minimumCost {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了95.56%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了42.05%的用户
     */
    public int minimumCost(int[] cost) {
        // 先排序
        Arrays.sort(cost);
        int len = cost.length;
        // cnt为记录当前有几个相邻的数字相加
        int ans = 0, cnt = 0;
        // 遍历数组
        for (int i = len - 1; i >= 0; i--) {
            // 现将价格相加
            ans += cost[i];
            // cnt自增
            cnt++;
            // 如果cnt为2，达到条件
            if (cnt == 2) {
                // 跳过下一个数字
                i--;
                // 重置cnt
                cnt = 0;
            }
        }
        // 返回相加的价格
        return ans;
    }
}
