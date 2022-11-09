package LeetCode.CodeCarl.stackqueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 前 K 个高频元素
 *
 * @author xoke
 * @date 2022/11/9
 */
public class _347_topKFrequent {
    /**
     * 执行用时：13 ms, 在所有 Java 提交中击败了49.57%的用户
     * 内存消耗：43.9 MB, 在所有 Java 提交中击败了64.37%的用户
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.offer(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.offer(key);
            }
        }
        int[] res = new int[k];
        for (int i = 0; !pq.isEmpty(); i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
