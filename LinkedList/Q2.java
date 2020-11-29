package LinkedList;

import java.util.*;

public class Q2 {
    Node head; // Head of list

    // Linked list node

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        // Reverse first k nodes of linked list

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        // next is now a pointer to (k+1)th node Recursivly call for the list starting
        // from current.
        // And make rest of the list as next of first node

        if (next != null) {
            head.next = reverse(next, k);
        }

        return prev;
    }

    // Utility functions

    public void push(int new_data) {

        // Allocate the node & put in the data

        Node new_node = new Node(new_data);

        // Make next of new Node as head

        new_node.next = head;

        // Move the head to point to new node

        head = new_node;
    }

    // Function to print linked list

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    // Driver code

    public static void main(String[] args){
        Q2 llist = new Q2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            llist.push(data);
        }

        System.out.println("Given Linked list");
        llist.printList();

        int k = sc.nextInt();

        llist.head = llist.reverse(llist.head, k);

        System.out.println("Reversed list");
        llist.printList();
    }

}
