package BinaryTree;

import java.util.*;

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
            System.out.println(tempNode.data);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    


}
