package LeetCode;

/**
 * 找出星型图的中心节点
 */
public class _1791_findCenter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：63.8 MB, 在所有 Java 提交中击败了60.46%的用户
     */
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}

