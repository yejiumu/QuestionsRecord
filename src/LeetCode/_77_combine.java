package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 *
 * @author xoke
 * @date 2022/11/19
 */
public class _77_combine {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了79.19%的用户
     */
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        back(n, k, 1);
        return list;
    }

    public void back(int n, int k, int startIndex) {
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }
        // temp 长度加上区间 [i, n] 的长度小于 k，不可能构造出长度为 k 的 temp
        for (int i = startIndex; temp.size() + (n - i + 1) < k; i++) {
            temp.add(i);
            back(n, k, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
