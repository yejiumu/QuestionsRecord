package LeetCode.CodeCarl.backtrack;

/**
 * 解数独
 *
 * @author xoke
 * @date 2022/11/23
 */
public class _37_solveSudoku {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了49.72%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了39.35%的用户
     */
    public void solveSudoku(char[][] board) {
        backing(board, board.length, board[0].length);
    }

    public boolean backing(char[][] board, int row, int col) {
        // 每个位置都要放数字，所以要用双重循环
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 不是数字才可以进行下一步
                if (board[i][j] != '.') {
                    continue;
                }
                // 遍历9个数字依次判断
                for (char k = '1'; k <= '9'; k++) {
                    // 如果不冲突
                    if (isValid(i, j, k, board)) {
                        // 进行赋值
                        board[i][j] = k;
                        // 进行递归判断
                        if (backing(board, row, col)) {
                            // 如果成功，直接返回true
                            return true;
                        }
                        // 不成功，进行回溯
                        board[i][j] = '.';
                    }
                }
                // 如果9个数字都不想，直接返回false即可，可能之前的数字发错了
                return false;
            }
        }
        // 最后都放完了，返回true
        return true;
    }

    // 判断该位置放value是否合适
    public boolean isValid(int row, int col, char value, char[][] board) {
        // 检查行
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }
        // 检查列
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }
        // 检查3*3矩阵
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
