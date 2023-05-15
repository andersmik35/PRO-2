package binartreestuderende;


public class BinaryIntMain {
    public static void main(String[] args) {
        BinaryTree<Integer> fifteen = new BinaryTree<>(15);
        BinaryTree<Integer> eleven = new BinaryTree<>(11,null,fifteen);
        BinaryTree<Integer> twentyFive = new BinaryTree<>(25);
        BinaryTree<Integer> thirty = new BinaryTree<>(30,twentyFive,null);
        BinaryTree<Integer> twentyTwo = new BinaryTree<>(22,eleven,thirty);
        BinaryTree<Integer> eightyEight = new BinaryTree<>(88);
        BinaryTree<Integer> ninety = new BinaryTree<>(90,eightyEight,null);
        BinaryTree<Integer> seventySeven = new BinaryTree<>(77,null,ninety);
        BinaryTree<Integer> fourtyFive = new BinaryTree<>(45,twentyTwo,seventySeven);

        System.out.println(fourtyFive.size());

        System.out.println(fourtyFive.hoejde());
        /*fourtyFive.preOrder();
        fourtyFive.inOrder();
        fourtyFive.postOrder();*/
        System.out.println(fourtyFive.sum());



    }

}
