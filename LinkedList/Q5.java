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
        while(temp != null){
            System.out.format("%d",temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
    public Node findStartNodeOfTheLoop(){
        Node fastPtr = head;
        Node slowPtr = head;
        boolean loopExist = false;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                loopExist = true;
                break;
            }
        }
        if (loopExist) {
            slowPtr = head;
            while(slowPtr != fastPtr){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
        } else {
            System.out.println("Loop dost not exists");
            slowPtr = null;
        }
        return slowPtr;
    }

    public static void main(String[] args){
        Q5 list = new Q5();
        Node loopNode = new Node(7);
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(loopNode);
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();
        list.addToTheLast(loopNode);

        Node startNode = list.findStartNodeOfTheLoop();
        if (startNode!=null) {
            System.out.println("start Node of loop is " + startNode.value);
        }
        // Final
    }
}
