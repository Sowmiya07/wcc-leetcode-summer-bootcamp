package phase1.assignments;

import phase1.Node;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = Node.createLinkedList(new int[]{1, 2, 3, 4, 5}, -1);
//        Node mid = findMiddleBF(head);
        Node mid = findMiddleOptimal(head);
        System.out.println(mid.val);

        Node head1 = Node.createLinkedList(new int[]{1, 2, 3, 4, 5, 6}, -1);
//        Node mid1 = findMiddleBF(head1);
        Node mid1 = findMiddleOptimal(head1);
        System.out.println(mid1.val);
    }

    public static Node findMiddleOptimal(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static Node findMiddleBF(Node head) {
        int count = 0;
        Node current = head;
        while(current != null) {
            count += 1;
            current = current.next;
        }
        int mid = count / 2;
        count = 0;
        current = head;
        while(count < mid) {
            current = current.next;
            count += 1;
        }
        return current;
    }
}
