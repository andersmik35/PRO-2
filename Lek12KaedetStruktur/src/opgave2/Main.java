package opgave2;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.addElement("Bent");
        list.addElement("Anders");
        list.addElement("Jens");
        list.addElement("Kurt");
        list.addElement("Hans");

        list.udskrivElements();
        System.out.println(list.countElements());
        System.out.println("--------------------");
        list.removeLast();
        list.udskrivElements();
        System.out.println("--------------------");


        list.removeElement("Anders");
        list.udskrivElements();
        System.out.println(list.countElements());

        System.out.println("--------------------");

        SortedLinkedList list1 = new SortedLinkedList();
        list1.addElement("Ægir");
        list1.addElement("Øjvind");
        list1.addElement("Bekir");

        list.addAll(list1);
        list.udskrivElements();







    }
}
