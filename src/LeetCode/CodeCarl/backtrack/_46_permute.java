package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 *
 * @author xoke
 * @date 2022/11/22
 */
public class _46_permute {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了61.49%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backing(nums, 0, used);
        return list;
    }

    public void backing(int[] arr, int index, boolean[] used) {
        if (index == arr.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            temp.add(arr[i]);
            backing(arr, index + 1, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
