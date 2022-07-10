package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _696_countBinarySubstrings {
    /**
     * 执行用时：12 ms, 在所有 Java 提交中击败了41.85%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了91.26%的用户
     */
    public int countBinarySubstrings(String s) {
        int pre = 0, len = s.length();
        // 对连续的数进行计数
        List<Integer> list = new ArrayList<>();
        while (pre < len) {
            char ch = s.charAt(pre);
            int count = 0;
            while (pre < len && s.charAt(pre) == ch) {
                pre++;
                count++;
            }
            list.add(count);
        }
        int ans = 0;
        for (int i = 1; i < list.size(); i++) {
            // 对相邻的最小数进行累加
            // 因为要相同连续个数，所以选最小的
            ans += Math.min(list.get(i), list.get(i - 1));
        }
        return ans;
    }
}
