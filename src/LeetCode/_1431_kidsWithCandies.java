package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 拥有最多糖果的孩子
 */
public class _1431_kidsWithCandies {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了78.48%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了51.90%的用户
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        // 遍历寻找数组中的最大值
        int max = -1;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        // 将数组中的值加上额外数再与最大值进行对比，将结果添加进列表中
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        // 返回列表
        return list;
    }
}
