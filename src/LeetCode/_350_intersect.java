package LeetCode;

import java.util.*;

/**
 * 两个数组的交集 II
 */
public class _350_intersect {
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了5.18%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了29.22%的用户
     */
//    public int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list1 = new ArrayList<>();
//        for (int j : nums1) {
//            list1.add(j);
//        }
//        //创建另一个列表，用于存储nums2与nums1中相同的元素
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < nums2.length; i++) {
//            if (list1.contains(nums2[i])) {
//                list2.add(nums2[i]);
//                //将nums2[i]封装，remove(Object o)
//                list1.remove(Integer.valueOf(nums2[i]));
//            }
//        }
//        int[] ans = new int[list2.size()];
//        int i = 0;
//        for (int num : list2) {
//            ans[i++] = num;
//        }
//        return ans;
//    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了85.09%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了37.03%的用户
     * <p>
     * 为了降低空间复杂度，首先遍历较短的数组并在哈希表中记录每个数字以及对应出现的次数，
     * 然后遍历较长的数组得到交集。
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        //先遍历短者，为降低空间复杂度
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            //未找到默认0并加一，找到返回数值再加一，最后赋值count
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        //最多不过短者长度
        int[] res = new int[nums1.length];
        int index = 0;
        //遍历操作
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                //如果count > 0，对res数值赋值
                res[index++] = num;
                count--;
                if (count > 0) {
                    //如果还大于零，说明map里可能有很多个，重新赋值进map中
                    map.put(num, count);
                } else {
                    //如果小于等于零，说明map中没有该元素，直接删除
                    map.remove(num);
                }
            }
        }
        //直接使用Arrays方法，截取res数组中的一段
        return Arrays.copyOfRange(res, 0, index);
    }
}
