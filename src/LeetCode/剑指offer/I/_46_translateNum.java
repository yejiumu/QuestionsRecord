package LeetCode.剑指offer.I;

/**
 * 把数字翻译成字符串
 *
 * @author jiumu
 * @date 2023/2/16
 */
public class _46_translateNum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了96.56%的用户
     */
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int len = s.length(), p = 1, q = 1;
        for (int i = 2; i <= len; i++) {
            String tmp = s.substring(i - 2, i);
            int r = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? p + q : p;
            q = p;
            p = r;
        }
        return p;
    }
}
