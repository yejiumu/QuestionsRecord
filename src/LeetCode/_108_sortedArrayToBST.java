package LeetCode;

/**
 * 将有序数组转换为二叉搜索树
 */
public class _108_sortedArrayToBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了31.38%的用户
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        //递归创建高度平衡二叉搜索树
        return loop(nums, 0, nums.length - 1);
    }

    //创建二叉树的递归函数，传入原数组和左右指针
    public TreeNode loop(int[] nums, int left, int right) {
        //如果left > right时，直接返回null
        if (left > right) {
            return null;
        }
        //创建中指针mid
        int mid = (left + right) / 2;
        //创建根节点，并将nums数组中的mid位置的值赋给根节点
        TreeNode root = new TreeNode(nums[mid]);
        //此结点的左子树继续递归
        root.left = loop(nums, left, mid - 1);
        //此结点的右子树继续递归
        root.right = loop(nums, mid + 1, right);
        //返回该节点
        return root;
    }
}
