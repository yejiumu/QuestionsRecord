package LeetCode;

/**
 * 消除游戏
 */
public class _390_lastRemaining {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了85.24%的用户
     * 内存消耗：37.4 MB, 在所有 Java 提交中击败了55.71%的用户
     */
    public int lastRemaining(int n) {
        int a1 = 1, an = n;
        int step = 1, k = 0, cnt = n;
        while (cnt > 1) {
            if (k % 2 == 0) {
                a1 += step;
                an = cnt % 2 == 0 ? an : an - step;
            } else {
                a1 = cnt % 2 == 0 ? a1 : a1 + step;
                an = an - step;
            }
            k++;
            cnt /= 2;
            step *= 2;
        }
        return a1;
    }
}
