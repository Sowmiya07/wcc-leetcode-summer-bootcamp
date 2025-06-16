package solutions.assignments;

import solutions.Node;

import static solutions.Node.createLinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        Node node = createLinkedList(new int[]{1, 2, 3, 4, 5, 6}, 2);
        boolean hasCycle = hasCycle(node);
        System.out.println(hasCycle);
    }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
