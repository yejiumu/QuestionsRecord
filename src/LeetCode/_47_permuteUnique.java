package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列 II
 *
 * @author xoke
 * @date 2022/11/22
 */
public class _47_permuteUnique {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.86%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了85.17%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                used[i] = true;
                temp.add(arr[i]);
                backing(arr, index + 1, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
