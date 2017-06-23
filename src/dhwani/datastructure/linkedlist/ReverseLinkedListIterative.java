package dhwani.datastructure.linkedlist;

/**
 * Created by dhwani on 4/26/17.
 *
 * program to reverse linked list with Iterative mathod
 */
public class ReverseLinkedListIterative {


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


    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node head)
    {
// For first node, previousNode will be null
        Node previous=null;
        Node nextNode;
        while(head!=null)
        {
            nextNode=head.next;
            // reversing the link
            head.next=previous;
            // moving currentNode and previousNode by 1 node
            previous=head;
            head=nextNode;
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseLinkedListIterative list = new ReverseLinkedListIterative();
        // Creating a linked list
        Node head=new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList(head);
        //Reversing LinkedList
        Node reverseHead=reverseLinkedList(head);
        System.out.println("After reversing");
        list.printList(reverseHead);

    }

}
