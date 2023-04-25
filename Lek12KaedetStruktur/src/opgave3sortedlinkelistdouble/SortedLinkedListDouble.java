package opgave3sortedlinkelistdouble;

public class SortedLinkedListDouble {

    private Node first;
    private Node last;
    private int size;

    public SortedLinkedListDouble() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node temp = first;
            Node prev = null;
            while (temp != null && e.compareTo(temp.data) > 0) {
                prev = temp;
                temp = temp.next;
            }
            if (prev == null) {
                newNode.next = first;
                first.prev = newNode;
                first = newNode;
            } else if (temp == null) {
                newNode.prev = last;
                last.next = newNode;
                last = newNode;
            } else {
                newNode.next = temp;
                newNode.prev = prev;
                prev.next = newNode;
                temp.prev = newNode;
            }
        }
    }


    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        Node temp = first;
        while (temp != null && !temp.data.equals(e)) {
            temp = temp.next;
        }
        if (temp == null) {
            return false;
        }
        if (temp.prev == null){
            first = first.next;
        }else {
            temp.prev.next = temp.next;
        }
        if (temp.next == null) {
            last = last.prev;
        }else {
            temp.next.prev = temp.prev;
        }
        return true;
    }


    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
     */
    public void udskrivBagfra() {
        Node temp = last;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Privat indre klasse der modellerer en node i en dobbeltkædet liste
    class Node {
        public String data;
        public Node next;
        public Node prev;
    }
}
