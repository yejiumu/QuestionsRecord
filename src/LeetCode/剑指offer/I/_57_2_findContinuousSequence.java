package LeetCode.剑指offer.I;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续正数序列
 *
 * @author xoke
 * @date 2022/8/19
 */
public class _57_2_findContinuousSequence {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了95.10%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了32.28%的用户
     */
    public int[][] findContinuousSequence(int target) {
        // 滑动窗口，l为左边界，r为右边界，l->r一定连续
        // r一定小于等于target/2+1
        // 当窗口中数字和小于target时，r右移; 大于target时，l右移; 等于target时就获得了一个解
        List<int[]> list = new ArrayList<>();
        for (int l = 1, r = 1, sum = 0; r <= target / 2 + 1; r++) {
            sum += r;
            while (sum > target) {
                sum -= l++;
            }
            if (sum == target) {
                int len = r - l + 1;
                int[] temp = new int[len];
                for (int i = 0; i < len; i++) {
                    temp[i] = l + i;
                }
                list.add(temp);
            }
        }
        int len = list.size();
        int[][] ans = new int[len][];
        for (int i = 0; i < len; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
