package LeetCode.剑指offer.I;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiumu
 * @date 2023/2/14
 */
public class _62_lastRemaining {
    /**
     * 执行用时：1076 ms, 在所有 Java 提交中击败了5.17%的用户
     * 内存消耗：43.5 MB, 在所有 Java 提交中击败了19.48%的用户
     */
    public int lastRemaining_(int n, int m) {
        // 暴力
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了99.23%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了66.30%的用户
     */
    public int lastRemaining(int n, int m) {
        // 规律
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
