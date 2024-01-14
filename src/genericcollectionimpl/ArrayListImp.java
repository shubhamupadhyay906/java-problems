package genericcollectionimpl;

import java.util.Arrays;

public class ArrayListImp {
    private int[] a1;
    private static final int DEFAULT_CAPACITY = 10;
    private int currentIndex = 0;
    private int size = 0;

    public ArrayListImp() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayListImp(int initialCapacity) {
        a1 = new int[initialCapacity];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[" + a1[0]);
        for (int i = 1; i <= size - 1; i++) {
            sb.append(", ").append(a1[i]);
        }
        return sb + "]";
    }

    public void add(int element) {
        ensureCapacity();
        a1[currentIndex] = element;
        currentIndex++;
        size++;
    }

    public void ensureCapacity() {
        if (currentIndex == (a1.length)) {
            grow();
        }
    }

    public void grow() {
        a1 = Arrays.copyOf(a1, newCapacity());
    }

    public int newCapacity() {
        return a1.length + (a1.length >> 1);
    }

    public boolean remove(int index) {
        if (index < 0 || index >= currentIndex) {
            return false;
        }
        System.arraycopy(a1, index + 1, a1, index, size - index - 1);
        size--;
        currentIndex--;
        System.out.println(size - index - 1);
        return true;
    }

    public void add(int index, int element) {
        if (index < 0 || index >= currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        System.arraycopy(a1, index, a1, index + 1, size - index);
        a1[index] = element;
        currentIndex++;
        size++;
    }

    public void set(int index, int element) {
        if (index < 0 || index >= currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        a1[index] = element;
    }

    public boolean delete(int element) {
        for (int i = 0; i <= size - 1; i++) {
            if (a1[i] == element) {
                return remove(i);
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        return a1[index];
    }

    public void clear() {
        a1 = null;
        currentIndex = 0;
        size = 0;
        a1 = new int[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contain(int element) {
        for (int i = 0; i <= size - 1; i++) {
            if (a1[i] == element) {
                return true;
            }
        }
        return false;
    }
}
