package LeetCode;

/**
 * 执行操作后的变量值
 *
 * @author xoke
 * @date 2022/7/31
 */
public class _2011_finalValueAfterOperations {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了6.09%的用户
     */
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            // 直接判断中间位置的字符
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
