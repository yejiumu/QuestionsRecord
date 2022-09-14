package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和
 *
 * @author xoke
 * @date 2022/9/14
 */
public class _39_combinationSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了18.26%的用户
     */
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        dfs(0, len, candidates, target);
        return ans;
    }

    public void dfs(int cur, int len, int[] candidates, int target) {
        // 到最后直接退出
        if (cur == len) {
            return;
        }
        // 找到组合
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        // 下一位
        dfs(cur + 1, len, candidates, target);
        // 判断当前是否还在范围内
        if (target - candidates[cur] >= 0) {
            // 加入列表
            temp.add(candidates[cur]);
            dfs(cur, len, candidates, target - candidates[cur]);
            temp.remove(temp.size() - 1);
        }
    }
}
