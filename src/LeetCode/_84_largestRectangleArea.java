package LeetCode;

/**
 * 柱状图中最大的矩形
 *
 * @author jiumu
 * @date 2023/1/14
 */
public class _84_largestRectangleArea {
    /**
     *
     */
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            int left = i, right = i;
            while (left > 0 && heights[left - 1] >= heights[i]) {
                left--;
            }
            while (right < len - 1 && heights[right + 1] >= heights[i]) {
                right++;
            }
            res = Math.max(res, (right - left + 1) * heights[i]);
        }
        return res;
    }
}
