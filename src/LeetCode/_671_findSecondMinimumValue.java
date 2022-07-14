package LeetCode;

/**
 * 二叉树中第二小的节点
 */
public class _671_findSecondMinimumValue {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了78.02%的用户
     */
    public int findSecondMinimumValue(TreeNode root) {
        return myFun(root, root.val);
    }

    public int myFun(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        if (root.val > val) {
            return root.val;
        }
        // 直到找到比root.val更大的值，或者-1
        int l = myFun(root.left, val);
        int r = myFun(root.right, val);
        // 如果两个都大于root.val，取较小者
        if (l > val && r > val) {
            return Math.min(l, r);
        }
        // 如果只有一个大于或者都小于，返回较大者
        return Math.max(l, r);
    }
}
