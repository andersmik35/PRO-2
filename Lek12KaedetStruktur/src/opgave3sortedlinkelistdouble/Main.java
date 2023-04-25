package opgave3sortedlinkelistdouble;

public class Main {
    public static void main(String[] args) {
    SortedLinkedListDouble list = new SortedLinkedListDouble();
        list.addElement("Bent");
        list.addElement("Anders");
        list.addElement("Jens");
        list.addElement("Kurt");
        list.addElement("Hans");

        list.udskrivElements();
        System.out.println(list.countElements());
        System.out.println("--------------------");
        list.removeElement("Hans");
        list.udskrivElements();
        System.out.println("--------------------");
        list.udskrivBagfra();
        System.out.println("--------------------");


    }
}
