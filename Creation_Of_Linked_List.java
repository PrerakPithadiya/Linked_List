package Anuj_Bhaiya;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Creation_Of_Linked_List{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        Node head = n1;

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node tail = n5;
    }
}
