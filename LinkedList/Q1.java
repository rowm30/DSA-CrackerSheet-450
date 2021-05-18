package LinkedList;

class Q1{

    static Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // Reverse the List
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // Print content of double linked list
    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        Q1 list = new Q1();
        list.head = new Node(42);
        list.head.next = new Node(12);
        list.head.next.next = new Node(21);
        list.head.next.next.next = new Node(66);
        list.head.next.next.next.next = new Node(90);

        System.out.println("Given Linked list:");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reverse linked list");
        list.printList(head);
    }


}