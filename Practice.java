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
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}
package LinkedList;

public class Q4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode l1 = new ListNode(8);
        head.next = l1;
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(5);
        l2.next = l3;
        ListNode l4 = new ListNode(10);
        l3.next = l4;
        l4.next = l2;

        // 2->8->3->5->10--
        // ^ |
        // | |
        // -----------
    }

    public static void removeLoop(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        // Boolean to check if tehre a loop exixts in the given Linked List
        boolean flag = false;
        // Traverse the list until prt2 or ptr 2.next becomes null.
        while (ptr2 != null && ptr1.next != null) {
            // Move forward ptr1 by one node.
            ptr1 = ptr1.next;
            // Move forward ptr2 by two nodes.
            ptr2 = ptr2.next.next;
            // Check if ptr1 and ptr2 meet at some node, then there is a loop in the linked
            // list
            // List and so make the falg true and break the loop
            if (ptr1 == ptr2) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // Assign head to ptr1.
            ptr1 = head;
            // Loop until next of ptr1 and ptr2 are not equal
            while (ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            // Make next of ptr2 that is last node of Linked List Null.
            ptr2.next = null;
        }
    }
}

