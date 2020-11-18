package LinkedList;

public class Q5 {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void addToTheLast(Node node){
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while (temp.next  != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    public void printList(){
        Node temp = head;
    }
}
