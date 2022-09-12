package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 *
 * @author xoke
 * @date 2022/9/12
 */
public class _78_subsets {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了96.85%的用户
     */
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            // 记录答案
            ans.add(new ArrayList<>(temp));
            return;
        }
        // 选择当前位置
        temp.add(nums[cur]);
        dfs(cur + 1, nums);
        // 不选择当前位置
        temp.remove(temp.size() - 1);
        dfs(cur + 1, nums);
    }
}
