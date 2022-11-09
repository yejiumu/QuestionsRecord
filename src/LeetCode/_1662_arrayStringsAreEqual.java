package LeetCode;

/**
 * 检查两个字符串数组是否相等
 *
 * @author xoke
 * @date 2022/11/9
 */
public class _1662_arrayStringsAreEqual {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了27.75%的用户
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // 这里也可以抽取成一个方法，进行拼接字符串
        // 然后直接比较两个返回的字符串即可
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for (String s : word1) {
            w1.append(s);
        }
        for (String s : word2) {
            w2.append(s);
        }
        return w1.toString().equals(w2.toString());
    }
}
