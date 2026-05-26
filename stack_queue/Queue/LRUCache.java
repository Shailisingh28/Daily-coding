package stack_queue.Queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public class Node {
        int key, val;
        Node next, pre;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map;
    int capacity;
    Node head;
    Node tail;

    LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    public void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void insert(Node node) {
        Node temp = head.next;

        head.next = node;
        node.pre = head;

        node.next = temp;
        temp.pre = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.val;
    }

    public void put(int key, int val) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            map.remove(key);
        }
        Node newnNode = new Node(key, val);
        insert(newnNode);
        map.put(key, newnNode);
        if (map.size() > capacity) {
            Node lru = tail.pre;
            remove(lru);
            map.remove(lru.key);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3);

        System.out.println(cache.get(2)); // -1

        cache.put(4, 4);

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}
