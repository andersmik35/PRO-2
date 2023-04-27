package opgave2;

public class App {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.addElement("Bent");
        list.addElement("Anders");
        list.addElement("Jens");
        list.addElement("Kurt");
        list.addElement("Hans");

        for (String s : list){
            System.out.println(s);

        }

    }
}
