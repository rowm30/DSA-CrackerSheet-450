package BinaryTree;

import java.util.*;

public class Q6 {
    
    public static void preOrder(Node root){
        // return if the current node is empty
        if(root == null){
            return;
        }

        // Display the data part of the root(or current node)
        System.out.print(root.data + " ");

        // Traverse the left subtree 
        preOrder(root.left);

        // Traverse the right subtree
        preOrder(root.right);
    }

    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.data);
                root.left = cur;
            }else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
    }

}

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}