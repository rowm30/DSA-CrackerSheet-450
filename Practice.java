// Java program to find height of tree

class Q3{
    NodeXL root;

    

    public static void main(String[] args){
        Q3 tree = new Q3();

        tree.root = new NodeXL(1);
        tree.root.left = new NodeXL(2);
        tree.root.right = new NodeXL(3);
        tree.root.left.left = new NodeXL(4);
        tree.root.left.right = new NodeXL(5);
        tree.root.left.right.left = new NodeXL(5);
        tree.root.left.right.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.right.left = new NodeXL(5);
        tree.root.right.right = new NodeXL(5);
        tree.root.right.right.left = new NodeXL(5);
        tree.root.right.right.left.right = new NodeXL(5);
        
        System.out.println("Height is : " + tree.maxDepth(tree.root));
    }
}

class NodeXL{
    int data;
    NodeXL left,right;

    NodeXL(int item){
        data = item;
        left = right = null;
    }
}