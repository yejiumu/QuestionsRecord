package LeetCode.WeekMatch.the_319;

import LeetCode.TreeNode;

import java.util.*;

/**
 * 这个没写出来，就卡在交换次数上了
 *
 * @author xoke
 * @date 2022/11/13
 */
public class C {
    public int minimumOperations(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
//            int[] arr = new int[len];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
//                arr[i] = node.val;
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res += swap(list);
        }
        return res;
    }

    public int swap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = list.size();
//        int[] sorted = Arrays.copyOf(arr, len);
        List<Integer> sorted = new ArrayList<>(list);
//        Arrays.sort(sorted);
        Collections.sort(sorted);
        for (int i = 0; i < len; i++) {
            map.put(sorted.get(i), i);
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            while (!Objects.equals(sorted.get(i), list.get(i))) {
                Collections.swap(list, i, map.get(list.get(i)));
                ++count;
            }
        }
        return count;
    }
}
