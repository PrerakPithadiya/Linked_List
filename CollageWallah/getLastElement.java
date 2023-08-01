package Collage_Wallah;
public class getLastElement{
    public static class LinkedList{
        class Node{
            String data;
            Node next;
            Node(String data){ this.data = data; }
        }
        Node head = null;
        void add(String data){
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
        void display(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("NULL");
        }
        String getLast(){
            Node i = head;
            if(head == null){
                System.out.println("Linked List is Empty..!");
                return null;
            }
            for(; i.next != null; i = i.next){ }
            return i.data;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
//        list.add("My");
//        list.add("Name");
        list.add("is");
        list.add("Pithadiya");
        list.add("Prerak");
        list.add("JasminBhai");
        list.display();
        System.out.println("Result : " + list.getLast());
    }
}