package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 递增子序列
 *
 * @author xoke
 * @date 2022/11/22
 */
public class _491_findSubsequences {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了62.25%的用户
     * 内存消耗：47.6 MB, 在所有 Java 提交中击败了34.14%的用户
     */
    //结果集合
    List<List<Integer>> res = new ArrayList<>();
    //路径集合
    LinkedList<Integer> path = new LinkedList<>();


    public List<List<Integer>> findSubsequences(int[] nums) {
        getSubsequences(nums, 0);
        return res;
    }

    private void getSubsequences(int[] nums, int start) {
        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
            // 注意这里不要加return，要取树上的节点
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = start; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.getLast()) {
                continue;
            }
            // 当前层使用过了当前数字
            if (map.getOrDefault(nums[i], 0) >= 1) {
                continue;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            path.add(nums[i]);
            getSubsequences(nums, i + 1);
            path.removeLast();
        }
    }
}
