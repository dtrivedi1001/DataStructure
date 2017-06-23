package dhwani.datastructure.linkedlist;

/**
 * Created by dhwani on 4/26/17.
 *
 * program to reverse linked list with Recursive mathod
 */
public class ReverseLinkedListRecursive {

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


    public static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node remaining = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }

   /* public static Node reverseLinkedList(Node currentNode)
    {
// For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }*/

    public static void main(String[] args) {
        ReverseLinkedListRecursive list = new ReverseLinkedListRecursive();
        // Creating a linked list
        Node head=new Node(50);
        list.addToTheLast(head);
        list.addToTheLast(new Node(60));
        list.addToTheLast(new Node(70));
        list.addToTheLast(new Node(10));
        list.addToTheLast(new Node(20));

        list.printList(head);
        //Reversing LinkedList
        Node reverseHead=reverseLinkedList(head);
        System.out.println("After reversing");
        list.printList(reverseHead);

    }

}
