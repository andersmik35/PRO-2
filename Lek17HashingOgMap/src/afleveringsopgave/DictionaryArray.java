package afleveringsopgave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryArray<Integer, V> implements Dictionary<Integer, V> {
    private ArrayList<V>[] tabel;
    private static int N = 10;
    private static double loadFactorLimit = 0.2;


    /**
     * HashingMap constructor comment.
     */

    public DictionaryArray() {
        tabel = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tabel[i] = new ArrayList<V>();
        }
    }

    @Override
    public V get(Integer key) {
        int i = key.hashCode() % N;
        ArrayList<Integer, V> m = tabel[i];
        return m.get(key);
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        int i = 0;
        while (empty && i < N) {
            empty = (tabel[i]).isEmpty();
            i++;
        }
        return empty;
    }

    @Override
    public V put(Integer key, V value) {
        double loadFactor = (double) size() / N;
        System.out.println("loadFactor = " + loadFactor);
        if (loadFactor > loadFactorLimit) {
            rehash();
            System.out.println("rehashing");
        }
        int i = key.hashCode() % N;
        Map<Integer, V> m = tabel[i];
        V oldValue = m.get(key);
        m.put(key, value);
        return oldValue;
    }


    @Override
    public V remove(Integer key) {
        int i = key.hashCode() % N;
        Map<K, V> m = tabel[i];
        V oldValue = m.get(key);
        m.remove(key);
        return oldValue;
    }

    private void rehash() {
        Map<K, V>[] oldTabel = tabel;
        N = 2 * N;
        tabel = new HashMap[N];
        for (int i = 0; i < N; i++) {
            tabel[i] = new HashMap<K, V>();
        }
        for (int i = 0; i < oldTabel.length; i++) {
            Map<K, V> m = oldTabel[i];
            for (K key : m.keySet()) {
                V value = m.get(key);
                put(key, value);
            }
        }

    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < N; i++) {
            size += tabel[i].size();
        }
        return size;
    }

}



