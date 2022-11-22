package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 递增子序列
 *
 * @author xoke
 * @date 2022/11/22
 */
public class _491_findSubsequences {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backing(nums, 0, 0);
        return list;
    }

    public void backing(int[] arr, int index, int count) {
        if (count >= 2) {
            list.add(new ArrayList<>(temp));
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (!temp.isEmpty() && arr[i] < temp.get(temp.size() - 1)) {
                break;
            }
            temp.add(arr[i]);
            backing(arr, i + 1, count + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
