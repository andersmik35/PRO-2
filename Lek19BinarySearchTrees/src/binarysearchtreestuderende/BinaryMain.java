package binarysearchtreestuderende;

public class BinaryMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bsn = new BinarySearchTree<>();
        bsn.add(45);
        bsn.add(22);
        bsn.add(77);
        bsn.add(11);
        bsn.add(30);
        bsn.add(25);
        bsn.add(15);
        bsn.add(77);
        bsn.add(90);
        System.out.println("Expected: 11 15 22 25 30 45 77 80 90");
        System.out.println("Actual ");
        bsn.print();
        System.out.println("Max: " + bsn.findMax());
        System.out.println("Min: " + bsn.findMin());

        bsn.removeMin();
        System.out.println("Find new Min: " + bsn.findMin());

        bsn.removeMax();
        System.out.println("Find new Max: " + bsn.findMax());




    }
}
