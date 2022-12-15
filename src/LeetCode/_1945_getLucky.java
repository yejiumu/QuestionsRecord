package LeetCode;

/**
 * 字符串转化后的各位数字之和
 *
 * @author xoke
 * @date 2022/12/15
 */
public class _1945_getLucky {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了79.13%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了44.35%的用户
     */
    public int getLucky(String s, int k) {
        // 转化为数字
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            str.append(ch - 'a' + 1);
        }
        // 累加
        int sum = 0;
        while (k-- > 0) {
            for (char ch : str.toString().toCharArray()) {
                sum += ch - '0';
            }
            str = new StringBuilder();
            str.append(sum);
            sum = 0;
        }
        // 再转化为数字
        return Integer.parseInt(str.toString());
    }
}
