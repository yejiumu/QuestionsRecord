package LeetCode;

/**
 * 判断国际象棋棋盘中一个格子的颜色
 *
 * @author xoke
 * @date 2022/7/28
 */
public class _1812_squareIsWhite {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了58.38%的用户
     */
    public boolean squareIsWhite(String coordinates) {
        // 取横纵坐标
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';
        // 判断相加后是否为奇数，奇数为true，偶数为false
        return (x + y) % 2 == 1;
    }
}
