import java.util.*;

class Q86 {
    private static final int SIZE = 1000;
    private List<Pair>[] buckets;

    public Q86() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Pair p : buckets[index]) {
            if (p.key == key) {
                p.value = value; // update existing key
                return;
            }
        }
        buckets[index].add(new Pair(key, value)); // add new key-value pair
    }

    public int get(int key) {
        int index = hash(key);
        for (Pair p : buckets[index]) {
            if (p.key == key) {
                return p.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Iterator<Pair> it = buckets[index].iterator();
        while (it.hasNext()) {
            Pair p = it.next();
            if (p.key == key) {
                it.remove();
                return;
            }
        }
    }

    private static class Pair {
        int key, value;
        Pair(int k, int v) {
            key = k;
            value = v;
        }
    }
}