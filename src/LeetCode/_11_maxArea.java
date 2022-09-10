package LeetCode;

/**
 * 盛最多水的容器
 *
 * @author xoke
 * @date 2022/9/10
 */
public class _11_maxArea {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了66.32%的用户
     * 内存消耗：51.1 MB, 在所有 Java 提交中击败了95.16%的用户
     */
    public int maxArea(int[] height) {
        // 直接从边界开始
        int left = 0, right = height.length - 1, area = 0;
        while (left < right) {
            // area取大值
            area = Math.max(area, (right - left) * Math.min(height[right], height[left]));
            // 保留左右两边界的较大值，以求得更大值
            if (height[right] > height[left]) {
                ++left;
            } else {
                --right;
            }
        }
        return area;
    }
}
