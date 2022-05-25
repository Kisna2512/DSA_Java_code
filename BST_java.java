package java_DSA;



class Tree {
    public int data;
    Tree left;
    Tree right;

    Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BST {

    public Tree insert(Tree root, int val) {
        if (root == null) {
            return new Tree(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    void display(Tree root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.print(root.data + "->");
        display(root.right);
    }


    boolean search(Tree root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (val > root.data) {
            return search(root.right, val);
        }

        return search(root.left, val);

    }


    Tree Findmin(Tree root) {
        Tree temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    Tree deletion(Tree root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.data) {
            root.right = deletion(root.right, val);
        } else if (val < root.data) {
            root.left = deletion(root.left, val);
        } else {
            // no child
            if (root.left == null && root.right == null) {
                return null;
            }

            //one child left
            else if (root.right == null) {
                Tree temp = root.left;
                return temp;

            }

            //one child right
            else if (root.left == null) {
                Tree temp = root.right;
                return temp;
            }

            // two child
            else {
                Tree temp = Findmin(root.right);
                root.data = temp.data;
                root.right = deletion(root.right, temp.data);

            }


        }


        return root;


    }


}



public class BST_java {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //		Node root=null;
        //		Node root=new Node(0);
        Tree root;
        root = null;


        BST bt = new BST();
        root = bt.insert(root, 4);
        root = bt.insert(root, 5);
        root = bt.insert(root, 7);
        root = bt.insert(root, 3);
        root = bt.insert(root, 10);
        bt.display(root);

        System.out.println();
        if (bt.search(root, 7)) {
            System.out.println("Element present in BST");
        } else {
            System.out.println("Element is not present in BST");
        }

        //		root=bt.Findmin(root);
        //		System.out.println("Minimum Element in BST:- "+root.data);

        root = bt.deletion(root, 5);
        System.out.println("The BST after deletion is:- ");
        bt.display(root);







    }

}