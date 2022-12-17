package LeetCode;

/**
 * 外观数列
 *
 * @author xoke
 * @date 2022/12/17
 */
public class _38_countAndSay {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了59.72%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了72.29%的用户
     */
    public String countAndSay(int n) {
        String res = "1";
        // 直接迭代
        for (int i = 2; i <= n; i++) {
            StringBuilder str = new StringBuilder();
            int left = 0, right = 0, len = res.length();
            // 统计不同连续数字数量即可
            while (left < len) {
                while (right < len && res.charAt(left) == res.charAt(right)) {
                    right++;
                }
                str.append(right - left).append(res.charAt(left));
                left = right;
            }
            res = str.toString();
        }
        return res;
    }
}
