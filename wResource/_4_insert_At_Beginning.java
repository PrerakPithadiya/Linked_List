package w3Resource;
public class _4_insert_At_Beginning{
    public static class LinkedList{
        class Node{
            float data;
            Node next;
            Node(float data){ this.data = data; }
        }
        Node head = null;
        void add(float data){
            Node x = new Node(data);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void printLinkedList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void addFirst(float data){
            Node x = new Node(data);
            x.next = head;
            head = x;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(102.23f);
        list.add(237.98f);
        list.add(56.78f);
        list.add(203.11f);
        list.printLinkedList();
        list.addFirst(451.33f);
        list.printLinkedList();
        list.addFirst(792.57f);
        list.printLinkedList();
    }
}