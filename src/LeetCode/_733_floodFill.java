package LeetCode;

/**
 * 图像渲染
 */
public class _733_floodFill {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了38.01%的用户
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor, image[sr][sc]);
        // 原地改变数组，所以可以直接返回数组本身
        return image;
    }

    // 递归
    public void dfs(int[][] img, int i, int j, int newColor, int oldColor) {
        // 设置递归结束条件
        if (i < 0 || i >= img.length || j < 0 || j >= img[0].length) {
            return;
        }
        // 如果遇到不等于的初始值的，以及等于新值的，也直接结束递归
        if (img[i][j] != oldColor || img[i][j] == newColor) {
            return;
        }
        img[i][j] = newColor;
        // 上下左右递归
        dfs(img, i - 1, j, newColor, oldColor);
        dfs(img, i + 1, j, newColor, oldColor);
        dfs(img, i, j - 1, newColor, oldColor);
        dfs(img, i, j + 1, newColor, oldColor);
    }
}
