public class BinarySearchTree<X extends Comparable<X>> {
    public lol<X> root;

    public void insert(X value) {
        lol<X> node = new lol<>(value);

        if (root == null) {
            root = node;
            return;
        }

        traverseThruToInsertRec(root, node);
    }

    public void traverseThruToInsertRec(lol<X> latestRoot, lol<X> node) {
        //Check if we going left / right
        if (latestRoot.value.compareTo(node.value) > 0) {
            //Check if left doesn't exist
            if (latestRoot.left == null) {
                //Make it exist
                latestRoot.left = node;
                return;
            }
            //Since it exists, we go to it
            else {
                traverseThruToInsertRec(latestRoot.left, node);
            }
        }
        //left doesn't exist so we go right
        else {
            //Check if right doesn't exist
            if (latestRoot.right == null) {
                //Make it exist
                latestRoot.right = node;
                return;
            }
            //Since it exists, we go to it
            else {
                traverseThruToInsertRec(latestRoot.right, node);
            }
        }
    }
}
