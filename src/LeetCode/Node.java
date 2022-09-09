package LeetCode;

import java.util.List;

public class Node {
    public int val;
    public Node next;
    public Node random;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    
}
