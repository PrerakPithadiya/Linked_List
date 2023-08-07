package Collage_Wallah;
public class Clear{
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
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void print(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void clear(){
            head = null;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(33);
        list.add(45);
        list.print();
        list.clear();
        list.print();
    }
}