package Collage_Wallah;
public class Linked_List_Length{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        //create node
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n8 = new Node(8);
        Node n5 = new Node(1);
        Node n6 = new Node(5);
        Node n7 = new Node(0);

        Node head = n1;
        Node tail = n4;

        // create node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n8;
        n8.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        // display 
        System.out.print("The Listed List is : ");
        printLinkedList(head);

        // size
        int linkedListLength = findLinkedListLength(head);

        System.out.println("\nThe Linked List Length : " + linkedListLength);
    }
    public static void printLinkedList(Node head){
        for(Node i = head; i != null; i = i.next){
            System.out.print(i.data + " ");
        } System.out.println();
    }
    public static int findLinkedListLength(Node head){
        int len = 0;
        for(Node i = head; i != null; i = i.next){
            len++;
        }
        return len;
    }
}
