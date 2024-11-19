package src.main.java.core.module_9.collection;

public class MyStack<E> {
    private Node<E> top;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public void push(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        if (index == 0) {
            pop();
            return;
        }

        Node<E> current = top;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    // Returns the top element of the stack without removing it
    public E peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    // Returns and removes the top element of the stack
    public E pop() {
        if (top == null) {
            return null;
        }

        E value = top.data;
        top = top.next;
        size--;
        return value;
    }
    @Override
    public String toString() {
        String prefix = "[";
        String suffix = "]";
        String result = prefix;
        if (top == null)
            return result + suffix;
        Node<E> current = top;
        do {
            result += current.data.toString();
            current = current.next;
        } while (current != null);

        return result + suffix;
    }
}
