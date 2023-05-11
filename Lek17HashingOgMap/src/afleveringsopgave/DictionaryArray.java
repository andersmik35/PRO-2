package afleveringsopgave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryArray<K, V> implements Dictionary<K, V> {
    private static final int INITIAL_CAPACITY = 10;

    private List<Map<K, V>> table;
    private int size;

    /**
     * DictionaryArrayList constructor comment.
     */
    public DictionaryArray() {
        table = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table.add(new HashMap<>());
        }
        size = 0;
    }

    @Override
    public V get(K key) {
        int index = getIndex(key);
        Map<K, V> bucket = table.get(index);
        return bucket.get(key);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Map<K, V> bucket = table.get(index);
        V oldValue = bucket.put(key, value);
        if (oldValue == null) {
            size++;
        }
        return oldValue;
    }

    @Override
    public V remove(K key) {
        int index = getIndex(key);
        Map<K, V> bucket = table.get(index);
        V oldValue = bucket.remove(key);
        if (oldValue != null) {
            size--;
        }
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % table.size();
        return index;
    }

    private void rehash(){

    }
}

