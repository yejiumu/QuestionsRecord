package LeetCode;

/**
 * 连续字符
 */
public class _1446_maxPower {
    public int maxPower(String s) {
        int cnt = 0, ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            //如果有下一位相等，cnt++，比较cnt和ans的大小
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {//如果不相等，重置cnt为1
                cnt = 1;
            }
        }
        return ans;
    }
}
