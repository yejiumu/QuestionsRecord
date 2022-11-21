package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合总和II
 *
 * @author xoke
 * @date 2022/11/21
 */
public class _40_combinationSum2 {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了99.76%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了38.65%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(candidates, target, 0);
        return list;
    }

    public void back(int[] arr, int target, int index) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            // 同一层不能有重复元素，[1,1,2,5] -> [1,2,5]、[1,2,5]
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (target - arr[i] < 0) {
                break;
            }
            temp.add(arr[i]);
            back(arr, target - arr[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
