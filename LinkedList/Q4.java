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
