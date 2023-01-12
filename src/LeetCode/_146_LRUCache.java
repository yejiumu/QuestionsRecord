package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xoke
 * @date 2023/1/12
 */
public class _146_LRUCache {
    class LRUCache {
        class DLinkedNode {
            int key;
            int value;
            DLinkedNode pre;
            DLinkedNode next;

            public DLinkedNode() {
            }

            public DLinkedNode(int _key, int _value) {
                key = _key;
                value = _value;
            }
        }

        private final Map<Integer, DLinkedNode> cache = new HashMap<>();
        private int size;
        private final int capacity;
        private final DLinkedNode head;
        private final DLinkedNode tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.pre = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            moveTohead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                DLinkedNode newNode = new DLinkedNode(key, value);
                cache.put(key, newNode);
                ++size;
                if (size > capacity) {
                    DLinkedNode tail = removeTail();
                    cache.remove(tail.key);
                    --size;
                }
            } else {
                node.value = value;
                addToHead(node);
            }
        }

        public void moveTohead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        public void removeNode(DLinkedNode node) {
            node.next.pre = node.pre;
            node.pre.next = node.next;
        }

        public void addToHead(DLinkedNode node) {
            node.pre = head;
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
        }

        public DLinkedNode removeTail() {
            DLinkedNode res = tail.pre;
            removeNode(res);
            return res;
        }
    }
}
