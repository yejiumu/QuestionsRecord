package LeetCode;

/**
 * 二进制求和
 */
public class _67_addBinary {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.96%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了74.93%的用户
     */
    public String addBinary(String a, String b) {
        // String三兄弟最快的
        StringBuilder ans = new StringBuilder();
        int aLen = a.length(), bLen = b.length();
        // 取两者长度最长者
        int len = Math.max(aLen, bLen), carry = 0;
        for (int i = 0; i < len; i++) {
            // 分别判断当前下标是否在自己的范围内
            // 不在，carry加0
            // 在，carry加上当前位置的数值
            carry += i < aLen ? (a.charAt(aLen - 1 - i) - '0') : 0;
            carry += i < bLen ? (b.charAt(bLen - 1 - i) - '0') : 0;
            // 将carry余2强转后加入列表中
            ans.append((char) (carry % 2 + '0'));
            // 然后将carry除以2
            carry /= 2;
        }
        // 有可能会进位突破原来的最大长度，例如90 + 10 == 100
        if (carry > 0) {
            ans.append('1');
        }
        // 反转一下列表即所需结果
        ans.reverse();
        return ans.toString();
    }
}
