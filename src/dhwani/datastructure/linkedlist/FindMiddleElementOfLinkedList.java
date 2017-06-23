package dhwani.datastructure.linkedlist;

/**
 * Created by dhwani on 4/26/17.
 *
 * Find middle element of a linked list
 *
 * Efficient approach:

 Above approach will take two traversal but we can find middle element in one traversal also using following algo:

 1. Use two pointer fastptr and slowptr and initialize both to head of linkedlist
 2. Move fastptr by two nodes and slowptr by one node in each iteration.
 3. When fastptr reaches end of nodes, the slowptr pointer will be  pointing to middle element.

 */
public class FindMiddleElementOfLinkedList {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    // This function will find middle element in linkedlist
    public Node findMiddleNode(Node head)
    {
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer;

    }

    public static void main(String[] args) {
        FindMiddleElementOfLinkedList list = new FindMiddleElementOfLinkedList();
        // Creating a linked list
        Node head=new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(9));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();
        // finding middle element
        Node middle= list.findMiddleNode(head);
        System.out.println("Middle node will be: "+ middle.value);

    }

}
