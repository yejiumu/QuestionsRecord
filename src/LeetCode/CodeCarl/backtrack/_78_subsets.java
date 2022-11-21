package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 *
 * @author xoke
 * @date 2022/11/21
 */
public class _78_subsets {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了10.19%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backing(nums, 0);
        return list;
    }

    public void backing(int[] nums, int index) {
        list.add(new ArrayList<>(temp));
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backing(nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
