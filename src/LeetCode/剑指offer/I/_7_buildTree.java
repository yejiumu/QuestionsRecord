package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树
 *
 * @author jiumu
 * @date 2023/2/13
 */
public class _7_buildTree {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.83%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了56.15%的用户
     */
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        // 用map保存中序序列的数值对应位置
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode findNode(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
        // 判断范围内是否含有元素，左闭右开
        if (preBegin >= preEnd || inBegin >= inEnd) {
            return null;
        }
        // 找到前序遍历的第一个元素在中序遍历中的位置
        int rootIndex = map.get(preorder[preBegin]);
        // 构造结点
        TreeNode root = new TreeNode(inorder[rootIndex]);
        // 保存中序左子树的个数，用来确定前序数列的个数
        int lenOfLeft = rootIndex - inBegin;
        root.left = findNode(preorder, preBegin + 1, preBegin + lenOfLeft + 1, inorder, inBegin, inEnd);
        root.right = findNode(preorder, preBegin + lenOfLeft + 1, preEnd, inorder, rootIndex + 1, inEnd);
        return root;
    }

    public TreeNode dfs(int[] inorder, int inBegin, int inEnd, int[] preorder, int preBegin, int preEnd) {
        // 第一步
        if (preBegin == preEnd) {
            return null;
        }
        // 第二步：前序遍历数组的第一个元素，就是当前的中间结点
        int rootValue = preorder[preBegin];
        TreeNode root = new TreeNode(rootValue);
        // 叶子结点
        if (preEnd - preBegin == 1) {
            return root;
        }
        // 第三步：寻找切割点
        int rootIndex;
        for (rootIndex = inBegin; rootIndex < inEnd; rootIndex++) {
            if (inorder[rootIndex] == rootValue) {
                break;
            }
        }
        // 第四步：切割中序数组，得到 中序左数组和中序右数组
        // 第五步：切割前序数组，得到 前序左数组和前序右数组
        // 切割中序数组
        // 中序左区间，左闭右开[leftInorderBegin, leftInorderEnd)
        int leftInorderBegin = inBegin;
        int leftInorderEnd = rootIndex;
        // 中序右区间，左闭右开[rightInorderBegin, rightInorderEnd)
        int rightInorderBegin = rootIndex + 1;
        int rightInorderEnd = inEnd;

        // 切割前序数组
        // 前序左区间，左闭右开[leftPreorderBegin, leftPreorderEnd)
        int leftPreorderBegin = preBegin + 1;
        int leftPreorderEnd = preBegin + 1 + rootIndex - inBegin; // 终止位置是起始位置加上中序左区间的大小size
        // 前序右区间, 左闭右开[rightPreorderBegin, rightPreorderEnd)
        int rightPreorderBegin = preBegin + 1 + (rootIndex - inBegin);
        int rightPreorderEnd = preEnd;
        // 第六步
//        root.left = dfs(中序左数组, 前序左数组);
//        root.right = dfs(中序右数组, 前序右数组);
//        root.left = dfs(inorder, inBegin, rootIndex, preorder, preBegin + 1, preEnd + rootIndex - inBegin + 1);
//        root.right = dfs(inorder, rootIndex + 1, inEnd, preorder, preEnd + rootIndex - inBegin + 1, preEnd);
        root.left = dfs(inorder, leftInorderBegin, leftInorderEnd, preorder, leftPreorderBegin, leftPreorderEnd);
        root.right = dfs(inorder, rightInorderBegin, rightInorderEnd, preorder, rightPreorderBegin, rightPreorderEnd);

        return root;
    }

    // 没看出和上面哪里不一样，可能是回溯的问题？
    public TreeNode dfs1(int[] inorder, int inBegin, int inEnd, int[] preorder, int preBegin, int preEnd) {
        // 第一步
        if (preBegin == preEnd) {
            return null;
        }
        // 第二步：前序遍历数组的第一个元素，就是当前的中间结点
        int rootValue = preorder[preBegin];
        TreeNode root = new TreeNode(rootValue);
        // 叶子结点
        if (preEnd - preBegin == 1) {
            return root;
        }
        // 第三步：寻找切割点
        int rootIndex;
        for (rootIndex = inBegin; rootIndex < inEnd; rootIndex++) {
            if (inorder[rootIndex] == rootValue) {
                break;
            }
        }
        // 第四步：切割中序数组，得到 中序左数组和中序右数组
        // 第五步：切割前序数组，得到 前序左数组和前序右数组
        // 第六步
//        root.left = dfs(中序左数组, 前序左数组);
//        root.right = dfs(中序右数组, 前序右数组);
        root.left = dfs1(inorder, inBegin, rootIndex, preorder, preBegin + 1, preEnd + rootIndex - inBegin + 1);
        root.right = dfs1(inorder, rootIndex + 1, inEnd, preorder, preEnd + rootIndex - inBegin + 1, preEnd);
        return root;
    }
}
