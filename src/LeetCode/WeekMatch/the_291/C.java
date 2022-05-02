package LeetCode.WeekMatch.the_291;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 含最多 K 个可整除元素的子数组
 */
public class C {
    /**
     * 执行用时：187 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：56.2 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int countDistinct(int[] nums, int k, int p) {
        int len = nums.length;
        // 自动去重
        Set<List<Integer>> set = new HashSet<>();
        // 两重循环，遍历寻找
        for (int i = 0; i < len; i++) {
            // 可以整除p的个数
            int count = 0;
            // 从nums[i]开始的符合条件的集合
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < len; j++) {
                // 统计整除p的个数
                if (nums[j] % p == 0) {
                    count++;
                }
                // 如果当前个数大于k，直接退出循环
                if (count > k) {
                    break;
                }
                // 否则加入列表中(不过是否整除p，因为最多有k个就行，没有也可以)
                list.add(nums[j]);
                // 创建临时列表，将当前的状态进行赋值
                List<Integer> temp = new ArrayList<>(list);
                // 然后再添加进set集合进行去重
                // 这里不能直接添加list，因为后面可能还要进行添加操作
                // 所以set中的数值会发生改变，添加到set中的是对list的引用
                // 所以需要新创建一个临时列表进行操作
                set.add(temp);
            }
        }
        // 返回set集合的个数即可
        return set.size();
    }
}
