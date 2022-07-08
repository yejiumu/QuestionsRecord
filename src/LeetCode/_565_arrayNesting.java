package LeetCode;

/**
 * 数组嵌套
 */
public class _565_arrayNesting {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了80.20%的用户
     * 内存消耗：49.7 MB, 在所有 Java 提交中击败了83.26%的用户
     */
    public int arrayNesting(int[] nums) {
        int len = nums.length;
        // 因为一个元素只会遍历一次，直接查看是否访问即可
        boolean[] visited = new boolean[len];
        int ans = 0;
        for (int i = 0; i < len; i++) {
            // 如果当前元素未被访问
            if (!visited[i]) {
                // 从当前元素开始
                int start = nums[i], count = 0;
                // 开始循环遍历
                do {
                    start = nums[start];
                    count++;
                    // 并将走过的元素标记
                    visited[start] = true;
                    // 最终重合的时候结束循环
                } while (start != nums[i]);
                // 取最大值
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
