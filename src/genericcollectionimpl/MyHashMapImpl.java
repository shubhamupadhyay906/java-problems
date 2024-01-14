package genericcollectionimpl;

public class MyHashMapImpl {
    private Entry[] e;
    private int size;
    private double loadPercentage;
    private int capacity;

    public MyHashMapImpl() {
        this.capacity = 10;
        this.loadPercentage = 0.70;
        e = new Entry[capacity];
    }

    public MyHashMapImpl(int capacity, double loadPercentage) {
        e = new Entry[capacity];
        this.loadPercentage = loadPercentage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= e.length - 1; i++) {
            for (Entry te = e[i]; te != null; te = te.next) {
                sb.append("[ " + te + " ]");
            }
        }
        return sb + "";
    }

    public void put(Object key, Object value) {
        int hn = generateHashNumber(key);
        // logic will work only for 1st entry
        if (e[hn] == null) {
            e[hn] = new Entry(key, value, null);
        } else {
            // logic will work other than 1st entry
            Entry te = e[hn];
            while (te.next != null) {
                te = te.next;
            }
            te.next = new Entry(key, value, null);
        }
        size++;

        if (size > (loadPercentage * e.length)) {
            reHash();
        }

    }

    public Object get(Object key) {
        int bucketNumber = generateHashNumber(key);
        for (Entry te = e[bucketNumber]; te != null; te = te.next) {
            if (te.key.equals(key)) {
                return te.value;
            }
        }
        return null;
    }


    public Object remove(Object key) {
        int bucketNum = generateHashNumber(key);
        Entry te = e[bucketNum];
        Entry pre = null;
        while (te != null) {
            if (te.key.equals(key)) {
                Object value = te.value;
                if (pre == null) {
                    e[bucketNum] = te.next;
                } else {
                    pre.next = te.next;
                }
                size--;
                return value;
            }
            pre = te;
            te = te.next;
        }
        return null;
    }

    public boolean contains(Object key) {
        int bucketNumber = generateHashNumber(key);
        for (Entry te = e[bucketNumber]; te != null; te = te.next) {
            if (te.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        e = null;
        size = 0;
        e = new Entry[capacity];
    }

    public int size() {
        return size;
    }

    private void reHash() {
        Entry[] oe = e;
        e = new Entry[2 * oe.length];
        for (int k = 0; k <= oe.length - 1; k++) {
            for (Entry old = oe[k]; old != null; ) {
                Entry te = old;
                old = old.next;
                int newHashNumber = generateHashNumber(te.key);
                te.next = e[newHashNumber];
                e[newHashNumber] = te;
            }
        }
    }

    private int generateHashNumber(Object key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return (key.hashCode() % e.length);
    }

    private class Entry {
        Object key;
        Object value;
        Entry next;


        public Entry(Object key, Object value, Entry next) {
            super();
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {

            return key + " = " + value;
        }
    }

}
