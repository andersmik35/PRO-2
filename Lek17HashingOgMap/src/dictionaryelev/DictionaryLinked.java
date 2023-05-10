package dictionaryelev;

import java.util.ConcurrentModificationException;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        if (isEmpty()) return null;

        Node current = start.next;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        Node current = start.next;
        Node prev = start;
        while (current != null) {
            if (current.key.equals(key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            prev = current;
            current = current.next;
        }
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        prev.next = newNode;
        size++;
        return newNode.value;
    }


    @Override
    public V remove(K key) {
        Node current = start.next;
        Node prev = start;
        while (current != null) {
            if (current.key.equals(key)) {
                prev.next = current.next;
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }


    @Override
    public int size() {

        return size;
    }

    private class Node {
        Node next;
        K key;
        V value;


    }

}
