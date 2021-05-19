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

    public void push(int new_data){
        
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->"+" ");
            temp = temp.next;
        }
        System.out.println("");
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

  
    public static void main(String[] args){
        Q1 list = new Q1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Given Linked list:");
        printList();
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reverse linked list");
        printList();
    }


}