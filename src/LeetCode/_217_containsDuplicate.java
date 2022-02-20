package LeetCode;

import java.util.Arrays;

/**
 * 存在重复元素
 */
@SuppressWarnings("all")
public class _217_containsDuplicate {
    /*
     * 执行用时：5 ms, 在所有 Java 提交中击败了53.38%的用户
     * 内存消耗：45.6 MB, 在所有 Java 提交中击败了10.34%的用户
     *
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }/

    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了69.79%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了95.99%的用户
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
