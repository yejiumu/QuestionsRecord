package LeetCode;

/**
 * 实现 Trie (前缀树)
 *
 * @author xoke
 * @date 2022/9/8
 */
public class _208_Trie {
    /**
     * 执行用时：89 ms, 在所有 Java 提交中击败了7.38%的用户
     * 内存消耗：73.4 MB, 在所有 Java 提交中击败了5.01%的用户
     * <p>
     * 用二维数组写的，好像没有想象中的快
     */
    class Trie {

        int[][] trie;
        int[] cnt;
        int idx, N = 100010;

        public Trie() {
            trie = new int[N][26];
            cnt = new int[N];
            idx = 0;
        }

        public void insert(String word) {
            int p = 0;
            for (char ch : word.toCharArray()) {
                int u = ch - 'a';
                if (trie[p][u] == 0) {
                    trie[p][u] = ++idx;
                }
                p = trie[p][u];
            }
            cnt[p]++;
        }

        public boolean search(String word) {
            int p = 0;
            for (char ch : word.toCharArray()) {
                int u = ch - 'a';
                if (trie[p][u] == 0) {
                    return false;
                }
                p = trie[p][u];
            }
            return cnt[p] != 0;
        }

        public boolean startsWith(String prefix) {
            int p = 0;
            for (char ch : prefix.toCharArray()) {
                int u = ch - 'a';
                if (trie[p][u] == 0) {
                    return false;
                }
                p = trie[p][u];
            }
            return true;
        }
    }
}
