package phase1.assignments;

import phase1.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Node.createLinkedList(new int[]{1, 2, 3, 4, 5, 6}, -1);
        Node reversedHead = reverseList(head);
        Node.traverse(reversedHead);
    }

    public static Node reverseList(Node head) {
        Node current = head, prev = null;
        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
