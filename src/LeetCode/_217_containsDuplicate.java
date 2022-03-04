package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 */
@SuppressWarnings("all")
public class _217_containsDuplicate {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了85.14%的用户
     * 内存消耗：49.7 MB, 在所有 Java 提交中击败了68.37%的用户
     */
    public boolean containsDuplicate(int[] nums) {
        //创建set(元素唯一)
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            //一旦没加进去，直接返回true
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了69.79%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了95.99%的用户
     */
//    public boolean containsDuplicate(int[] nums) {
//        //先排序，将相等的数排在一起
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            //遍历，遇到相同的，直接返回true
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }
}
