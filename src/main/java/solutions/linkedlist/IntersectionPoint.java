package solutions.linkedlist;

import solutions.Node;

public class IntersectionPoint {
    public static void main(String[] args) {
        Node l1 = Node.createLinkedList(new int[]{1, 9, 1}, -1);
        Node l2 = Node.createLinkedList(new int[]{3, 2, 4}, -1);
        Node tmp = l1;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = l2.next;

        Node resBF = getIntersectionNodeBF(l1, l2);
        System.out.println(resBF != null ? resBF.val : resBF);
    }

    static Node getIntersectionNodeBF(Node headA, Node headB) {
        Node currentA = headA;
        while(currentA != null) {
            Node currentB = headB;
            while(currentB != null) {
                if(currentB == currentA) {
                    return currentA;
                }
                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }
}
