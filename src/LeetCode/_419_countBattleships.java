package LeetCode;

/**
 * 甲板上的战舰
 */
public class _419_countBattleships {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了22.45%的用户
     */
    public int countBattleships(char[][] board) {
        int cnt = 0, m = board.length, n = board[0].length;
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] != 'X') &&
                        (j == 0 || board[i][j - 1] != 'X')) {
                    ++cnt;
                }
        return cnt;
    }
}
