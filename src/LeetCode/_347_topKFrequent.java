package LeetCode;

import java.util.*;

/**
 * 前 K 个高频元素
 */
public class _347_topKFrequent {
    /**
     * 执行用时：12 ms, 在所有 Java 提交中击败了89.72%的用户
     * 内存消耗：43.9 MB, 在所有 Java 提交中击败了40.75%的用户
     */
    public int[] topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int[] ans = new int[k];
        int i = k - 1;
        // 倒序加入
        while (!pq.isEmpty()) {
            ans[i--] = pq.poll();
        }
        return ans;
    }
}
