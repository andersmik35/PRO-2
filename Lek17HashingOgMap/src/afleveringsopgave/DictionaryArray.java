package afleveringsopgave;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryArray<K, V> implements Dictionary<K, V> {
    private static final int INITIAL_CAPACITY = 10;
    private static final double LOAD_FACTOR_LIMIT = 0.75;

    private  ArrayList<Pair>[] table;
    private int size;

    public DictionaryArray() {
        table = new ArrayList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table[i] = new ArrayList<>();
        }
        size = 0;
    }


    @Override
    public V get(K key) {
        if (key == null){
            throw new IllegalArgumentException("Key is null");
        }
        if (isEmpty()){
            return null;
        }
        int index = key.hashCode() % table.length;
        for (Pair pair : table[index]) {
            if (pair.key.equals(key)) {
                return (V) pair.value;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        if (key == null){
            throw new IllegalArgumentException("Key is null");
        }
        if (value == null){
            throw new IllegalArgumentException("Value is null");
        }
        int index = key.hashCode() % table.length;
        for (Pair pair : table[index]) {
            if (pair.key.equals(key)) {
                V oldValue = pair.value;
                pair.value = value;
                return oldValue;
            }
        }
        table[index].add(new Pair(key, value));
        size++;
        if (size > table.length * LOAD_FACTOR_LIMIT){
            rehash();
        }
        return null;
    }

    @Override
    public V remove(K key) {
        if (key == null){
            throw new IllegalArgumentException("Key is null");
        }
        int index = key.hashCode() % table.length;
        List<Pair> list = table[index];
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                V oldValue = (V) pair.value;
                list.remove(pair);
                size--;
                return oldValue;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private int getIndex(K key){
        int hashCode = key.hashCode();
        int index = hashCode % table.length;
        if (index < 0){
            index += table.length;
        }
        return index;
    }
    private void rehash(){
        int newCapacity = table.length * 2;
        ArrayList<Pair> [] newTable = new ArrayList[newCapacity];
        for (int i = 0; i < newCapacity; i++) {
            newTable[i] = new ArrayList<>();
        }
        for (ArrayList<Pair> pairs : table) {
            for (Pair pair : pairs) {
                int index = getIndex((K) pair.key);
                newTable[index].add(pair);
            }
        }

    }


    class Pair{
        K key;

        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

