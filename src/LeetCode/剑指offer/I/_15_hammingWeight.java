package LeetCode.剑指offer.I;

/**
 * 二进制中1的个数
 *
 * @author xoke
 * @date 2022/8/18
 */
public class _15_hammingWeight {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.9 MB, 在所有 Java 提交中击败了13.83%的用户
     */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // 直接获取二进制中最后一个1前的数值
            // 101010(1)0000
            // 101010(0)1111
            // 101010(最后一个1前的数值)
            n = n & (n - 1);
            ++count;
        }
        return count;
    }
}
