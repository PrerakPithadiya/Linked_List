package Collage_Wallah;

public class insertAtEnd{
    public static class LinkedList{
        public class Node{
            String data;
            Node next;
            Node(String data){
                this.data = data;
            }
        }
        Node head = null;
        void add(String data){
            Node x = new Node(data);
            if(head == null){
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void display(){
            Node i = head;
            for(; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("NULL");
        }
        void addLast(String data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("Om");
        list.add("Utsav");
        list.add("Hardik");
        list.addLast("Raj");
        list.addLast("Umang");
        list.display();
    }
}