package LeetCode;

/**
 * 任务调度器
 *
 * @author jiumu
 * @date 2023/1/13
 */
public class _621_leastInterval {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.7 MB, 在所有 Java 提交中击败了25.04%的用户
     */
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for (char task : tasks) {
            counts[task - 'A']++;
        }
        // max为种类中任务数最多的数量，total为有几个这样的任务种类
        int max = 0, total = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, counts[i]);
        }
        for (int i = 0; i < 26; i++) {
            total += counts[i] == max ? 1 : 0;
        }
        return Math.max(tasks.length, (n + 1) * (max - 1) + total);
    }
}
