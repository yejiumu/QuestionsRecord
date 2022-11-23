package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * N 皇后
 *
 * @author xoke
 * @date 2022/11/23
 */
public class _51_solveNQueens {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了92.82%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了84.68%的用户
     */
    List<List<String>> list = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        for (char[] ch : chess) {
            Arrays.fill(ch, '.');
        }
        backing(n, 0, chess);
        return list;
    }

    public void backing(int n, int row, char[][] chess) {
        if (n == row) {
            list.add(array2List(chess));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n, chess)) {
                chess[row][col] = 'Q';
                backing(n, row + 1, chess);
                chess[row][col] = '.';
            }
        }
    }

    public List<String> array2List(char[][] chess) {
        List<String> temp = new ArrayList<>();
        for (char[] ch : chess) {
            temp.add(String.copyValueOf(ch));
        }
        return temp;
    }

    public boolean isValid(int row, int col, int n, char[][] chess) {
        // 检查列
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        // 检查45度(左倾)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        // 检查135度(右倾)
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
