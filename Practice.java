// Java program to find height of tree

class Q3{
    NodeXL root;

    int maxDepth(NodeXL node){
        if (node == null) {
            return 0;
        } else {
            // Compute the depth of each sub tree
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            // Use the larger one 
            if (lDepth>rDepth) {
                return(lDepth+1);
            } else {
                return(rDepth+1);
            }
        }
    }

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
package BinaryTree;

import java.util.*;

import jdk.nashorn.api.tree.Tree;

public class Q1 {
    

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }

    // print in level order
    public static void levelOrderTraversal(TreeNode startNode){
        Queue<TreeNode> queue  = new LinkedList<TreeNode>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static TreeNode createBinaryTree(){
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);
        
        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }
    
    public static void main(String[] args){
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("Level order traversal-");
        levelOrderTraversal(rootNode);
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