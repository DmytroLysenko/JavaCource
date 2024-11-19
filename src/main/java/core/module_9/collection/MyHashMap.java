package src.main.java.core.module_9.collection;

public class MyHashMap<K, E> {
    private static final int INITIAL_CAPACITY = 16;
    private Node<K, E>[] buckets;
    private int size;

    private static class Node<K, E> {
        final K key;
        E value;
        Node<K, E> next;

        Node(K key, E value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    public void put(K key, E value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, E> existing = buckets[bucketIndex];

        while (existing != null) {
            if (existing.key.equals(key)) {
                existing.value = value;
                return;
            }
            existing = existing.next;
        }

        Node<K, E> newNode = new Node<>(key, value);
        buckets[bucketIndex] = newNode;
        size++;
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, E> current = buckets[bucketIndex];
        Node<K, E> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[bucketIndex] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, E> current = buckets[bucketIndex];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private int getBucketIndex(K key) {
        int index = (key == null) ? 0 : Math.abs(key.hashCode() % buckets.length);
        return index;
    }
}
