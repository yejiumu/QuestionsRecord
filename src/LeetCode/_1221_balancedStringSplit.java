package LeetCode;

public class _1221_balancedStringSplit {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了78.14%的用户
     */
    public int balancedStringSplit(String s) {
        // 统计R和L出现的次数(使用他们之间的差值也行)，然后比较
        int numL = 0, numR = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                numR++;
            } else {
                numL++;
            }
            // 如果相等，即为一种情况，然后再重置R和L的个数
            if (numL == numR) {
                ans++;
                numL = 0;
                numR = 0;
            }
        }
        return ans;
    }
}
