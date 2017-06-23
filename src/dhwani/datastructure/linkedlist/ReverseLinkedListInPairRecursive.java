package dhwani.datastructure.linkedlist;

/**
 * Created by dhwani on 4/26/17.
 *
 * program to reverse linked list in pairs using Recursive method
 *
 */
public class ReverseLinkedListInPairRecursive {

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

    // Reverse linked list in pair Recursive method
    public static Node reverseLinkedListInPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Lets take example of 5->6->7
        // Here head node is 5
        // Storing 6 in temp node, it will become our new head
        Node temp=head.next;
        // Putting link between 5->7
        head.next=temp.next;
        // putting link between 6->5
        temp.next=head;
        // recursively calling the function for node 7
        head.next=reverseLinkedListInPairs(head.next);
        // returning new head
        return temp;
    }

    public static void main(String[] args) {
        ReverseLinkedListInPairRecursive list = new ReverseLinkedListInPairRecursive();
        // Creating a linked list
        Node head=new Node(50);
        list.addToTheLast(head);
        list.addToTheLast(new Node(60));
        list.addToTheLast(new Node(70));
        list.addToTheLast(new Node(10));
        list.addToTheLast(new Node(20));
        list.addToTheLast(new Node(80));

        list.printList(head);
        //Reversing LinkedList in pairs
        Node result=reverseLinkedListInPairs(head);
        System.out.println("After reversing in pair");
        list.printList(result);

    }

}
