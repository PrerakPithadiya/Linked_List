package Collage_Wallah;
public class removeLast{
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
                System.out.print(i.data + " --> ");
            } System.out.println("null");
        }
        void removeLast(){
            try {
                if (head.next == null) {
                    head = null;
                    return;
                }
                Node i = head;
                while (i.next.next != null) {
                    i = i.next;
                }
                i.next = null;
            } catch(Exception e){
                System.out.println("The List is Empty..!");
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(45);
        list.add(55);
        list.print();
        list.removeLast();
        list.print();
        list.removeLast();
        list.print();
        list.removeLast();
        list.print();
        list.removeLast();
//        list.print();
    }
}