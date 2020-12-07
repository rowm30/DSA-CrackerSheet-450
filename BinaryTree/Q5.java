package BinaryTree;

public class Q5 {
    return 0; 

    // If tree is not empty then height = 1 + max of 
    // left height and right heights 
    return (1
            + Math.max(height(node.left), 
                    height(node.right))); 
} 

// Driver Code 
public static void main(String args[]) 
{ 
    // creating a binary tree and entering the nodes 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 

    // Function Call 
    System.out.println( 
        "The diameter of given binary tree is : "
        + tree.diameter()); 
} 
}
 