package LeetCode;

/**
 * 数组异或操作
 *
 * @author xoke
 * @date 2022/7/28
 */
public class _1486_xorOperation {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了93.75%的用户
     */
    public int xorOperation(int n, int start) {
        // 直接初始化为首项
        int ans = start;
        for (int i = 1; i < n; i++) {
            // 从第2项开始进行异或操作
            ans = ans ^ (2 * i + start);
        }
        // 直接返回即可
        return ans;
    }
}
