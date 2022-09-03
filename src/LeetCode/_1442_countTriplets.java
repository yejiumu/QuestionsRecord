package LeetCode;

/**
 * 形成两个异或相等数组的三元组数目
 *
 * @author xoke
 * @date 2022/9/3
 */
public class _1442_countTriplets {
    /**
     * 执行用时：20 ms, 在所有 Java 提交中击败了36.59%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了64.81%的用户
     */
    public int countTriplets__(int[] arr) {
        int len = arr.length;
        int[] s = new int[len + 1];
        for (int i = 0; i < len; i++) {
            // 得出前缀和
            s[i + 1] = s[i] ^ arr[i];
        }
        int ans = 0;
        // 三重循环，属实是有点BT了
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j; k < len; k++) {
                    if (s[i] == s[k + 1]) {
                        ++ans;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了75.96%的用户
     */
    public int countTriplets_(int[] arr) {
        int len = arr.length;
        int[] s = new int[len + 1];
        for (int i = 0; i < len; i++) {
            // 得出前缀和
            s[i + 1] = s[i] ^ arr[i];
        }
        int ans = 0;
        // 二重循环，因为最后比较只和 i 和 k 有关，所以可以直接二重
        // 当条件成立时，[i + 1, k]内的 j 都满足条件(i < j <= k)，所以 ans 加上这些数即可
        for (int i = 0; i < len; i++) {
            for (int k = i + 1; k < len; k++) {
                if (s[i] == s[k + 1]) {
                    ans += k - i;
                }
            }
        }
        return ans;
    }
    /*
     * 后面的 O(n)就下次再看吧
     */
}
