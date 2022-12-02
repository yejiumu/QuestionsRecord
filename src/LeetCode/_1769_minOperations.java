package LeetCode;

/**
 * 移动所有球到每个盒子所需的最小操作数
 *
 * @author xoke
 * @date 2022/12/2
 */
public class _1769_minOperations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了98.63%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了79.91%的用户
     */
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int left = boxes.charAt(0) - '0', right = 0, operations = 0;
        // 统计第一个位置的右边有多少球，以及需要的步数
        for (int i = 1; i < len; i++) {
            if (boxes.charAt(i) == '1') {
                right++;
                operations += i;
            }
        }
        int[] res = new int[len];
        res[0] = operations;
        // 根据前一个盒子的操作数得到下一个盒子的操作数
        for (int i = 1; i < len; i++) {
            operations += left - right;
            if (boxes.charAt(i) == '1') {
                left++;
                right--;
            }
            res[i] = operations;
        }
        return res;
    }
}
