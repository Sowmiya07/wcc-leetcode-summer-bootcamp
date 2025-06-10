package phase1;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public static Node createLinkedList(int[] vals, int pos) {
        Node head = null, current = null;
        List<Node> nodes = new ArrayList<>();
        for (int val : vals) {
            Node node = new Node(val);
            if (head == null)
                head = node;
            else
                current.next = node;
            current = node;
            nodes.add(node);
        }

        if(pos != -1)
            current.next = nodes.get(pos);

        return head;
    }

    public static void traverse(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
