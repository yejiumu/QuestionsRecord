package LeetCode;

/**
 * 转换数字的最少位翻转次数
 *
 * @author xoke
 * @date 2022/7/29
 */
public class _2220_minBitFlips {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了71.16%的用户
     */
    public int minBitFlips(int start, int goal) {
        // 和_461_题一样的思路
        // 先取异或，得出两数二进制位不同的数字
        int temp = start ^ goal, ans = 0;
        // 然后统计该数的二进制位为1的个数
        while (temp != 0) {
            temp &= temp - 1;
            ++ans;
        }
        return ans;
    }
}
