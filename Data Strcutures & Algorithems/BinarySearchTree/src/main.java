public class main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> alright = new BinarySearchTree<>();
        System.out.println(alright.root);
        alright.insert(0);
        alright.insert(2);

        System.out.println("left is 0 and right don't exist?"+alright.root.left+" and "+ alright.root.right);
        System.out.println("alright value:" + alright.root.value);

        //cant have lol<> in binarySearchTree
        //alright.left; NOT A STATEMENT LOL
    }
}
