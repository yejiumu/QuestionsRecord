package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xoke
 * @date 2022/11/19
 */
public class _216_combinationSum3 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了86.09%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        back(k, n, 1);
        return list;
    }

    public void back(int k, int n, int startIndex) {
        // 剪枝
        if (n < 0) {
            return;
        }
        if (temp.size() == k) {
            if (n == 0) {
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            temp.add(i);
            back(k, n - i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
