package LeetCode;

/**
 * 单词搜索
 *
 * @author xoke
 * @date 2023/1/11
 */
public class _79_exist {
    /**
     * 执行用时：92 ms, 在所有 Java 提交中击败了71.04%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了37.52%的用户
     */
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 从[i,j]这个坐标开始查找
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] word, int i, int j, int index) {
        // 边界的判断，如果越界直接返回false。index表示的是查找到字符串word的第几个字符，
        // 如果这个字符不等于board[i][j]，说明验证这个坐标路径是走不通的，直接返回false
        if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word[index]) {
            return false;
        }
        // 如果word的每个字符都查找完了，直接返回true
        if (index == word.length - 1) {
            return true;
        }
        // 把当前坐标的值保存下来，为了在最后复原
        char temp = board[i][j];
        // 然后修改当前坐标的值
        board[i][j] = '.';
        // 走递归，沿着当前坐标的上下左右4个方向查找
        boolean res = dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);
        // 递归之后再把当前的坐标复原
        board[i][j] = temp;
        return res;
    }
}
