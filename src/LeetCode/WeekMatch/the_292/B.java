package LeetCode.WeekMatch.the_292;

import LeetCode.TreeNode;

public class B {
    /**
     * 执行用时：26 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了100.00%的用户
     */
//    public int averageOfSubtree(TreeNode root) {
//        int ans = 0;
//        if (root == null) {
//            return 0;
//        }
//        if (sums(root) / nums(root) == root.val) {
//            ans++;
//        }
//        return averageOfSubtree(root.right) + averageOfSubtree(root.left) + ans;
//    }
//
//    public int sums(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = sums(root.left);
//        int right = sums(root.right);
//        return left + right + root.val;
//    }
//
//    public int nums(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = nums(root.left);
//        int right = nums(root.right);
//        return left + right + 1;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    int cnt;

    public int averageOfSubtree(TreeNode root) {
        // 递归求解
        dfs(root);
        return cnt;
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0, 0};
        }
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int sum = (l[0] + r[0] + root.val), nodeNum = (l[1] + r[1] + 1), avg = sum / nodeNum;
        if (avg == root.val) {
            cnt++;
        }
        return new int[]{sum, nodeNum, avg};
    }

}
