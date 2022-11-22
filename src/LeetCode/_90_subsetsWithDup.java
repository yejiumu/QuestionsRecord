package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 子集 II
 *
 * @author xoke
 * @date 2022/11/22
 */
public class _90_subsetsWithDup {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.75%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了54.14%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backing(nums, 0);
        return list;
    }

    public void backing(int[] arr, int index) {
        list.add(new ArrayList<>(temp));
        if (index >= arr.length) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            backing(arr, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
