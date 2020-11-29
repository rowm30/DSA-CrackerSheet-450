package BinaryTree;



public class Q4 {
    Node root;

    int diameter(Node root){
        if (root == null){
            return 0;
        }

        int lheight = height(root.left);
        int rheight = hieght(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.left);

        return Math.max(lheight + rheight +1, Math.max(ldiameter, rdiameter));

    }
}

class Node {
    int data;
    Node left,right;

    public Node(int item){
        data= item;
        left = right = null;
    }
}
