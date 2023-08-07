package Collage_Wallah;
public class element{
    public static class LinkedList{
        class Node{
            int data;
            Node next;
            Node(int data){ this.data = data; }
        }
        Node head = null;
        void add(int data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){  }
                i.next = x;
            }
        }
        void print(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        int element(){
            try {
                return head.data;
            } catch(Exception e){
                System.out.println("The Linked List is Empty..!");
                return Integer.MIN_VALUE;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(65);
        list.add(89);
        list.add(44);
        list.print();
        System.out.println("First Element : " + list.element());
    }
}