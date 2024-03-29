package hashsetstudent;


import org.w3c.dom.Node;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
    private Object[] buckets;
    private int currentSize;
    private static final String DELETED = "DELETED";

    private double loadFactorVar;

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSetLinearProbing(int bucketsLength) {
        buckets = new Object[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = hashValue(x);
        while (buckets[h] != null) {
            if (buckets[h].equals(x)) {
                return true;
            }
            h = (h + 1) % buckets.length;
        }
        return false;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        if (contains(x)) {
            return false;
        }
        int h = hashValue(x);
        while (buckets[h] != null && !buckets[h].equals(DELETED)) {
            h = (h + 1) % buckets.length;
        }
        buckets[h] = x;
        currentSize++;
        return true;

    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false if x was not an
     * element of this set
     */
    public boolean remove(Object x) {
        if (!contains(x)) {
            return false;
        }
        int h = hashValue(x);
        while (!buckets[h].equals(x)) {
            h = (h + 1) % buckets.length;
        }
        buckets[h] = DELETED;
        currentSize--;
        return true;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    private int hashValue(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;
        return h;
    }

    // method only for test purpose
    public void writeOut() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println(i + "\t" + buckets[i]);
        }
    }


}
