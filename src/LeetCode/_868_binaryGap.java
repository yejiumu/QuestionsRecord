package LeetCode;

/**
 * 二进制间距
 */
public class _868_binaryGap {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了32.02%的用户
     */
    public int binaryGap(int n) {
        // 设定初始值，temp为-1是为了在如果二进制中只有一个1的情况下进行区分
        int temp = -1, ans = 0;
        for (int i = 0; n != 0; i++) {
            if ((n & 1) == 1) {
                // 如果只有一个1，这一步不会执行，所以输出的ans还是初始值0
                if (temp != -1) {
                    ans = Math.max(ans, i - temp);
                }
                temp = i;
            }
            n >>= 1;
        }
        return ans;
    }
}
