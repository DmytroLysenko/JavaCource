package src.main.java.core.module_9.collection;

import java.util.Arrays;

public class MyArrayList<E> {
    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (E[]) new Object[0];
        size = 0;
    }

    public void add(E value) {
        data = Arrays.copyOf(data, data.length + 1);
        data[size++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOf(data, data.length - 1);
        size--;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        data = (E[]) new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return data[index];
    }

    @Override
    public String toString() {
        String prefix = "[";
        String suffix = "]";
        String result = prefix;
        if (size == 0) {
            return result + suffix;
        }
        for (E item : data) {
            result += item.toString();
        }
        return result + suffix;
    }
}
