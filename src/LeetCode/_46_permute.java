package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 *
 * @author xoke
 * @date 2022/9/12
 */
public class _46_permute {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了52.20%的用户
     */
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        // 当前数字是否被访问过
        boolean[] visited = new boolean[len + 1];
        dfs(0, visited, nums, len);
        return ans;
    }

    public void dfs(int cur, boolean[] visited, int[] nums, int len) {
        // 已经找到一种完整排序
        if (cur == len) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            // 未访问的数字才能继续下列操作
            if (!visited[i + 1]) {
                path.add(nums[i]);
                // 当前数字标记为访问过
                visited[i + 1] = true;
                // 继续下一个数
                dfs(cur + 1, visited, nums, len);
                // 回溯，恢复原状
                path.remove(path.size() - 1);
                visited[i + 1] = false;
            }
        }
    }
}
