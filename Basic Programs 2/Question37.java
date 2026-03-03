import java.util.*;

public class Question37 {

    static class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    static class LRUCache {

        int capacity;
        Map<Integer, Node> map;
        Node head, tail;

        LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        void insert(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        int get(int key) {

            if (!map.containsKey(key))
                return -1;

            Node node = map.get(key);
            remove(node);
            insert(node);

            return node.value;
        }

        void put(int key, int value) {

            if (map.containsKey(key)) {
                remove(map.get(key));
            }

            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);

            if (map.size() > capacity) {

                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cache capacity: ");
        int capacity = sc.nextInt();
        LRUCache cache = new LRUCache(capacity);

        System.out.print("Enter number of operations: ");
        int operations = sc.nextInt();

        System.out.println("Enter operations (put key value / get key):");
        for (int i = 0; i < operations; i++) {

            String op = sc.next();

            if (op.equals("put")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                cache.put(key, value);
            } else if (op.equals("get")) {
                int key = sc.nextInt();
                System.out.println(cache.get(key));
            }
        }

        sc.close();
    }
}