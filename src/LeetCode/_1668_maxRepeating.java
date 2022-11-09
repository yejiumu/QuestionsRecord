package LeetCode;

/**
 * @author xoke
 * @date 2022/11/9
 */
public class _1668_maxRepeating {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了29.11%的用户
     */
    public int maxRepeating(String sequence, String word) {
        // 有点妙
        StringBuilder str = new StringBuilder();
        int res = 0;
        str.append(word);
        while (sequence.contains(str.toString())) {
            ++res;
            str.append(word);
        }
        return res;
    }
}
