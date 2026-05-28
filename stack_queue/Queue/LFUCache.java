package stack_queue.Queue;

import java.util.HashMap;

public class LFUCache {
    class Node {
        int key;
        int value;
        int freq;

        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DLL {

        Node head;
        Node tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;

            size = 0;
        }

        void insert(Node node) {

            Node temp = head.next;

            head.next = node;
            node.prev = head;

            node.next = temp;
            temp.prev = node;

            size++;
        }

        void remove(Node node) {

            Node prevNode = node.prev;
            Node nextNode = node.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            size--;
        }

        Node removeLast() {

            if (size > 0) {

                Node node = tail.prev;
                remove(node);

                return node;
            }

            return null;
        }
    }

    int capacity;
    int minFreq;

    HashMap<Integer, Node> map;
    HashMap<Integer, DLL> freqMap;

    public LFUCache(int capacity) {

        this.capacity = capacity;

        map = new HashMap<>();
        freqMap = new HashMap<>();

        minFreq = 0;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        updateFrequency(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (capacity == 0) {
            return;
        }

        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            updateFrequency(node);

        } else {

            if (map.size() == capacity) {

                DLL minList = freqMap.get(minFreq);

                Node nodeToRemove = minList.removeLast();

                map.remove(nodeToRemove.key);
            }

            Node newNode = new Node(key, value);

            minFreq = 1;

            DLL list = freqMap.getOrDefault(1, new DLL());

            list.insert(newNode);

            freqMap.put(1, list);

            map.put(key, newNode);
        }
    }

    private void updateFrequency(Node node) {

        int oldFreq = node.freq;

        DLL oldList = freqMap.get(oldFreq);

        oldList.remove(node);

        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;

        DLL newList = freqMap.getOrDefault(node.freq, new DLL());

        newList.insert(node);

        freqMap.put(node.freq, newList);
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1)); // 10

        cache.put(3, 30);

        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 30

        cache.put(4, 40);

        System.out.println(cache.get(1)); // 10
        System.out.println(cache.get(3)); // -1
        System.out.println(cache.get(4)); // 40
    }
}
