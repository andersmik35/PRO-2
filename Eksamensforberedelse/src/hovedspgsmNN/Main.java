package hovedspgsmNN;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> two = new BinaryTree<>("2");
        BinaryTree<String> four = new BinaryTree<>("4");
        BinaryTree<String> plus = new BinaryTree<>("+", two,four );
        BinaryTree<String> seven = new BinaryTree<>("7");
        BinaryTree<String> multiply1 = new BinaryTree<>("*",plus,seven);
        BinaryTree<String> three = new BinaryTree<>("3");
        BinaryTree<String> eight = new BinaryTree<>("2");
        BinaryTree<String> plus1 = new BinaryTree<>("+",three,eight);
        BinaryTree<String> root = new BinaryTree<>("-",multiply1,plus);

        System.out.println(root.countElement("2"));

    }
}
