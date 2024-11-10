package src.main.java.core.module_9.collection;

public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    // Returns the first item in the queue without removing it
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    // Returns and removes the first item in the queue
    public E poll() {
        if (head == null) {
            return null;
        }

        E value = head.data;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return value;
    }

    @Override
    public String toString() {
        String prefix = "[";
        String suffix = "]";
        String result = prefix;
        if (head == null)
            return result + suffix;
        Node<E> current = head;
        do {
            result += current.data.toString();
            current = current.next;
        } while (current != null);

        return result + suffix;
    }
}
