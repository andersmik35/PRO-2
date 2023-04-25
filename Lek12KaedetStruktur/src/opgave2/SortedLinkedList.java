package opgave2;

public class SortedLinkedList {
    // TODO: hvilke felt variable er nødvendige
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til
     * den naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;
        if (first == null) {
            first = newNode;
        } else if (e.compareTo(first.data) <= 0) {
            newNode.next = first;
            first = newNode;

        } else {
            Node temp = first;
            while (temp.next != null && e.compareTo(temp.next.data) > 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
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

    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal
     * fortsat være sorteret i henhold til den naturlige ordning på
     * elementerne.
     *
     * @return true der blev fjernet et element ellers returneres
     * false.
     */
    public boolean removeLast() {
        if (first == null) {
            return false;
        } else if (first.next == null) {
            first = null;
            return true;
        } else {
            Node temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return true;
        }

    }


    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat
     * være sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        if (first == null) {
            return false;
        } else if (first.data.equals(e)) {
            first = first.next;
            return true;
        } else {
            Node temp = first;
            while (temp.next != null && !temp.next.data.equals(e)) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Tilføjer alle elementerne fra list til den aktuelle liste.
     * Listen er fortsat sorteret i henhold til den naturlige ordning på
     * elementerne.
     */
    public void addAll(SortedLinkedList list) {
        Node temp = first;
        Node listTemp = list.first;

        while (listTemp != null) {
            int comparison = listTemp.data.compareTo(temp.data);

            if (comparison < 0) {

                Node newNode = new Node();
                newNode.data = listTemp.data;
                newNode.next = temp;

                if (temp == first) {
                    first = newNode;
                }

                temp = newNode;
                listTemp = listTemp.next;

            } else if (comparison > 0) {

                if (temp.next != null) {
                    temp = temp.next;
                } else {
                    while (listTemp != null) {
                        Node newNode = new Node();
                        newNode.data = listTemp.data;
                        temp.next = newNode;
                        temp = newNode;
                        listTemp = listTemp.next;
                    }
                }

            } else {
                temp = temp.next;
                listTemp = listTemp.next;
            }
        }
    }


    private class Node {
        public String data;
        public Node next;
    }
}



