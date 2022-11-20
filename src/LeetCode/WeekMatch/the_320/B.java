package LeetCode.WeekMatch.the_320;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xoke
 * @date 2022/11/20
 */
public class B {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> total = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        travel(root);
        int len = total.size();
        for (Integer query : queries) {
            List<Integer> temp = new ArrayList<>();
            // left为 <= query的最后一个，即 > query的第一个的左边一位
            int left = search(len, query + 1) - 1;
            if (left == len || left < 0) {
                temp.add(-1);
            } else {
                temp.add(total.get(left));
            }
            // right为 >= query的第一个值
            int right = search(len, query);
            if (right == len) {
                temp.add(-1);
            } else {
                temp.add(total.get(right));
            }
            list.add(new ArrayList<>(temp));
        }
        return list;
    }

    public void travel(TreeNode root) {
        if (root == null) {
            return;
        }
        travel(root.left);
        total.add(root.val);
        travel(root.right);
    }

    // 寻找值为 >= target 的左边界
    public int search(int len, int target) {
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (total.get(mid) < target) {
                left = mid + 1; // [mid + 1, right]
            } else {
                right = mid - 1;// [left, mid - 1]
            }
        }
        return left;
    }

}